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
public abstract class ClaseAbs {
    private String N_cli;
    private float Sld_cli,IVA;

    public String getN_cli() {
        return N_cli;
    }

    public void setN_cli(String N_cli) {
        this.N_cli = N_cli;
    }

    public float getSld_cli() {
        return Sld_cli;
    }

    public void setSld_cli(float Sld_cli) {
        this.Sld_cli = Sld_cli;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public int getCta_cli() {
        return Cta_cli;
    }

    public void setCta_cli(int Cta_cli) {
        this.Cta_cli = Cta_cli;
    }

    public int getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(int Movimientos) {
        this.Movimientos = Movimientos;
    }
    private int Cta_cli,Movimientos;

    public ClaseAbs(String N_cli, float Sld_cli, float IVA, int Cta_cli, int Movimientos) {
        this.N_cli = N_cli;
        this.Sld_cli = Sld_cli;
        this.IVA = IVA;
        this.Cta_cli = Cta_cli;
        this.Movimientos = Movimientos;
    }
    
    public abstract void M_Corte();
    public abstract float Calculo_IVA();
    public abstract void Mov_Deposito(float deposito);
    public abstract String Mov_Consulta();
    public abstract String Mov_Retiro(float retiro);
}
