
package activitat1.pkg3.pkg2_m9_uf2;


public class Fils {
   int numComprovar;
   
    public Fils(int numero){
        this.numComprovar = numero;
    } 

    Fils() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void run(){
        if(numComprovar % 1 == 0 && numComprovar % numComprovar == 0){
            System.out.println(numComprovar + " és primo.");
        }
    }
    
}
