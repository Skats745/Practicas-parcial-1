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
public class ClaseOper extends ClaseAbs {
    public ClaseOper(String N_cli, float Sld_cli, float IVA, int Cta_cli, int Movimientos) {
        super(N_cli, Sld_cli, IVA, Cta_cli, Movimientos);
    }

    @Override
    public void M_Corte() {
        int mes=1;
        float Corte=Calculo_IVA()+250;
       if(getSld_cli()<10000){
           if(mes>=1){
               setSld_cli(getSld_cli()-Corte);
            }    
           System.out.println("Comicion por corte es $: "+Corte);
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
                setSld_cli((getSld_cli())+deposito);
                System.out.print("Deposito Exitoso");
            }else{
             System.out.print("No se  puede depositar mas del limite establacido");
        }
    }

    @Override
    public String Mov_Consulta() {
        
         return  "Saldo Disponible $"+getSld_cli();
    }

    @Override
    public String Mov_Retiro(float retiro) {
        
        if(retiro<getSld_cli()){
                setSld_cli(getSld_cli()-retiro);
                return "Retiro Exitoso";
            }else{
            return "Sin fondos";
        }
    
    }
}
