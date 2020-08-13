
package practica.herencia;

/**
 *
 * @author duck1
 */
public class ClasePaqBasico extends ClaseFiesta {
    int cniños, cextra;
    
    public ClasePaqBasico(){
        cniños=0;
        cextra=0;
    }
    
    public ClasePaqBasico(int PaqBasico, int PaqPlus, int cniños, int cextra){
        super(PaqBasico,PaqPlus);
        this.cniños=cniños;
        this.cextra=cextra;
    }
    
    public int operacion(){
        int obtener=0;
        if (cniños>30){
            obtener=getPaqBasico()+(cextra*30);
        }else{
            obtener=getPaqBasico();
        }
        return obtener;
    }
}
