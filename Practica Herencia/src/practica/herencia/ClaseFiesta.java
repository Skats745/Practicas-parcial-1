package practica.herencia;

/**
 *
 * @author duck1
 */
public class ClaseFiesta {
    private int PaqBasico, PaqPlus;

    public ClaseFiesta(int PaqBasico, int PaqPlus) {
        this.PaqBasico = PaqBasico;
        this.PaqPlus = PaqPlus;
    }
    
    public ClaseFiesta(){
        PaqBasico=0;
        PaqPlus=0;
    }
    
    public int getPaqBasico() {
        return PaqBasico;
    }

    public void setPaqBasico(int PaqBasico) {
        this.PaqBasico = PaqBasico;
    }

    public int getPaqPlus() {
        return PaqPlus;
    }

    public void setPaqPlus(int PaqPlus) {
        this.PaqPlus = PaqPlus;
    }
    
    
}
