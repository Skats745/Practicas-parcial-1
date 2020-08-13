/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author duck1
 */
public class ClasePrincipal extends ClaseAbs {
    public ClasePrincipal(String N_cli, float Sld_cli, float IVA, int Cta_cli, int Movimientos) {
        super(N_cli, Sld_cli, IVA, Cta_cli, Movimientos);
    }

    @Override
    public void M_Corte() {
        System.out.println("No aplica, Cuenta Inicial");
    }

    @Override
    public float Calculo_IVA() {
        return (getSld_cli()*getIVA())/100;
    }
   
    

    @Override
    public void Mov_Deposito(float deposito) {
        float valor=Calculo_IVA()+25;
        
        if (getSld_cli()>20000) {
            if(valor<4000){
                if(getMovimientos()<4){
                    setSld_cli(getSld_cli()+deposito);
                }else{
                    setSld_cli(getSld_cli()-valor+deposito);
                }
                
                System.out.println("Deposito Exitoso de $"+deposito);
            }
            
        }else{
          
            System.out.println("Lo sentimos,No se puede depositar mas de 40000");
        }
        
    }

    @Override
    public String Mov_Consulta() {
        return "Saldo disponible"+getSld_cli();
    }

    @Override
    public String Mov_Retiro(float retiro) {
        float valor=Calculo_IVA()+25;
        if(retiro<4000){
            return "Lo sentimos, no se puede retirar mas de $4,000";
        }else{
            if(getSld_cli()<retiro){
                setSld_cli(getSld_cli()-retiro);
            }else{
                setSld_cli((getSld_cli()-valor)-retiro);
            }
            return "Retiro Exitoso";
        }
    }
    
}
