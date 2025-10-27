import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        try {
            // ping -n 3 google.com (3 pings)
            ProcessBuilder builder = new ProcessBuilder("ping", "-n", "3", "google.com");
            
            System.out.println("Lanzando proceso ping...");
            
            Process proceso = builder.start();
            
            System.out.println("Esperando a que termine el proceso...");
            
            int codigoSalida = proceso.waitFor();
            
            System.out.println("Proceso terminado con código: " + codigoSalida);
            
            if (codigoSalida == 0) {
                System.out.println("El proceso se ejecutó correctamente");
            } else {
                System.out.println("El proceso terminó con errores");
            }
            
        } catch (IOException e) {
            System.out.println("Error al crear el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El proceso fue interrumpido: " + e.getMessage());
        }
        
        System.out.println("\n Programa terminado");
    }
}