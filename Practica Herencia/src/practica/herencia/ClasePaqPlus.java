
package practica.herencia;

/**
 *
 * @author duck1
 */
public class ClasePaqPlus extends ClaseFiesta {
    int pqregalo, pqbotarga, pqpayaso;
    
    public ClasePaqPlus(){
        this.pqbotarga=0;
        this.pqpayaso=0;
        this.pqregalo=0;
    }
    
    public ClasePaqPlus(int PaqBasico, int PaqPlus, int pqregalo, int pqbotarga, int pqpayaso){
        super(PaqBasico, PaqPlus);
        this.pqbotarga=pqbotarga;
        this.pqpayaso=pqpayaso;
        this.pqregalo=pqregalo;
    }
    
    public int operaciones(){
        int obtener, nreg, nbot, npay;
        nreg=pqregalo*30;
        nbot=pqbotarga*200;
        npay=pqpayaso*200;
        
        obtener=getPaqPlus()+nreg+nbot+npay;
        
        return obtener;
    }
}
