
package activitat1.pkg3.pkg2_m9_uf2;


public class Fils implements Runnable{
   int numComprovar;
   
    public Fils(int numero){
        this.numComprovar = numero;
    } 


    
    public void run(){
        if(numComprovar % 1 == 0 && numComprovar % numComprovar == 0){
            System.out.println(numComprovar + " és primo.");
        }
    }
    
}
