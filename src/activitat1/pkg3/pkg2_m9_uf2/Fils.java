package activitat1.pkg3.pkg2_m9_uf2;

import java.util.Date;

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
        for (int i = inicio + 2; i <= fin; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i + " es primo.");
            }
        }
    }

}
