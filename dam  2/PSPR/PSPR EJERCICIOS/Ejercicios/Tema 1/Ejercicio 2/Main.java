import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) {

        try {
            ProcessBuilder builder = new ProcessBuilder("ping", "-n", "4", "google.com");
            
            System.out.println("Lanzando proceso ping...");
            
            Process proceso = builder.start();
            
            System.out.println("Leyendo salida del proceso:");
            System.out.println("----------------------------------------");
            
            //Vamos a usar un BufferedReader que nos permite leer una linea completa con readLine
            
            BufferedReader lector = new BufferedReader(
                new InputStreamReader(proceso.getInputStream())
            );
            
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
            lector.close();
            
            int codigoSalida = proceso.waitFor();
            
            System.out.println("----------------------------------------");
            System.out.println("Proceso terminado con código: " + codigoSalida);
            
            if (codigoSalida == 0) {
                System.out.println("El ping se ejecutó correctamente");
            } else {
                System.out.println("Hubo algún problema con el ping");
            }
            
        } catch (IOException e) {
            System.out.println("Error al ejecutar el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El proceso fue interrumpido: " + e.getMessage());
        }
        
        System.out.println("\n Programa terminado");
    }
}