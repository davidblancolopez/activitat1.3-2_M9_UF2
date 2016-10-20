
package activitat1.pkg3.pkg2_m9_uf2;


public class Fils {
   int numComprovar;
   
    public Fils(int numero){
        this.numComprovar = numero;
    } 
    
    public boolean run(){
        return (numComprovar % 1 == 0 && numComprovar % numComprovar == 0);
    }
    
}
