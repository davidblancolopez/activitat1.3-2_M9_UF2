
package activitat1.pkg3.pkg2_m9_uf2;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Activitat132_M9_UF2 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        
        System.out.println("Introdueix un numero: ");
        numero = lector.nextInt();
        
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numero);
        
        
        for (int i = 1; i < numero; i++) {
            
            for (int j = i; j < i + 1000; j++) {
                
            }
        }
        
        
        
    }
    
}
