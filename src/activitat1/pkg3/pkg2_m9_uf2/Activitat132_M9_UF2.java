
package activitat1.pkg3.pkg2_m9_uf2;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Activitat132_M9_UF2 {


    public static void main(String[] args) {
        int contador = 3;
        int inicio, fin;
        
        //Bucle que creara un objeto fil tantas veces como el numero que se le indica en contador.
        for (int i = 1; i <= contador; i++) {
            inicio = (i - 1) * 1000;
            fin = i * 1000;
            Runnable fil = new Fils(inicio, fin);
            new Thread (fil).start();
        }
        
    }
    
}
