package activitat1.pkg3.pkg2_m9_uf2;

public class Fils implements Runnable {

    
    int inicio;
    int fin;

    public Fils(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    @Override
    
    public void run() {
        int contador = 2;
        boolean primo = true;
        
        
        for (int i = inicio; i <= fin; i++) {
            System.out.println("Comprovamos " + i);
                    while ((primo) && (contador != i)) {
            if (i % contador == 0) {
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
