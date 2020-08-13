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
public class ClaseMovimientos extends ClaseAbs {
    public ClaseMovimientos(String N_cli, float Sld_cli, float IVA, int Cta_cli, int Movimientos) {
        super(N_cli, Sld_cli, IVA, Cta_cli, Movimientos);
    }
    
     public Boolean validarMovimiento(float valor){
        if(valor<7000){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void M_Corte() {
        int mes=1;
        float cortes=Calculo_IVA()+150;
       if(getSld_cli()<3000){
           if(mes>=1){
               setSld_cli(getSld_cli()-cortes);
            }    
           System.out.println("Comision por corte es $: "+cortes);
         System.out.println("El saldo disponible : "+getSld_cli());
       }else{
           System.out.println("El saldo es $: "+getSld_cli());
       }
    }

    @Override
    public float Calculo_IVA() {
            return (getSld_cli()*getIVA())/100;
    }

    @Override
    public void Mov_Deposito(float deposito) {
          if(getSld_cli()<20000){
            if(validarMovimiento(deposito)){
                setSld_cli(getSld_cli()+deposito);
                System.out.println("Deposito Exitoso");
            }
            else{
                 System.out.println("Lo sentimos, No se puede depositar mas de 70000");
            } 
        }else{
             System.out.println("Lo sentimos,No se  puede depositar mas del limite establacido");
        }
    }

    @Override
    public String Mov_Consulta() {
        return "Saldo Disponible "+getSld_cli();
    }

    @Override
    public String Mov_Retiro(float retiro) {
        if(getSld_cli()<retiro){
               return "Sin fondos";
            }
            else{
                if(validarMovimiento(retiro)){
                     setSld_cli(getSld_cli()-retiro);
                     return "Retiro Exitoso";
                }
                else{
                    return "Lo sentimos,No se puede Retirar mas de $7,000";
                }
               
            }
    }
}
