
package activitat1.pkg3.pkg2_m9_uf2;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class Activitat132_M9_UF2 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        
        System.out.println("Introdueix un numero: ");
        numero = lector.nextInt();
        
        ScheduledExecutorService executor = (ScheduledExecutorService) Executors.newScheduledThreadPool(numero);
        
        
        for (int i = 0; i <= numero; i++) {
            for (int j = numero * 1000; j < (numero + 1) * 1000; j++) {
                Fils fils = new Fils();
            }
        }
    }
    
}
