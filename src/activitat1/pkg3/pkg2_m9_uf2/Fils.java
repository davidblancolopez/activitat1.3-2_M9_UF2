package activitat1.pkg3.pkg2_m9_uf2;

public class Fils implements Runnable {

    
    int inicio;
    int fin;

    public Fils(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    //Metodo para comprobar Si numero es primo
    @Override
    public void run() {
        int contador = 2;
        boolean primo = true;
        int numComprovar = inicio;
        
        
        for (int i = inicio; i <= fin; i++) {
            while ((primo) && (contador != numComprovar)) {
            if (numComprovar % contador == 0) {
                primo = false;
            }
            contador++;
        }
        
        if (primo) {
            System.out.println(i + " es un numero primo.");
        }
        }

    }

}
