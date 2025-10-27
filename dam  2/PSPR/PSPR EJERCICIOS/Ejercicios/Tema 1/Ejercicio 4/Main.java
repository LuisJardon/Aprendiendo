import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Lanzando procesos...");
            
            ProcessBuilder builder1 = new ProcessBuilder("ping", "-n", "6", "google.com");
            ProcessBuilder builder2 = new ProcessBuilder("ping", "-n", "4", "uniovi.es");
            ProcessBuilder builder3 = new ProcessBuilder("powershell", "-Command", "4000 * 12000");
            
            Process proceso1 = builder1.start();
            Process proceso2 = builder2.start();
            Process proceso3 = builder3.start();
            
            System.out.println("Proceso 1: Ping a Google (6 veces)");
            System.out.println("Proceso 2: Ping a Uniovi (4 veces)");
            System.out.println("Proceso 3: 4000 * 12000");
            System.out.println();
            
            System.out.println("Monitoreando procesos cada 2 segundos...");

            boolean hayProcesosVivos = true;
            
            while (hayProcesosVivos) {
                
                Thread.sleep(2000);
                
                boolean vivo1 = proceso1.isAlive();
                boolean vivo2 = proceso2.isAlive();
                boolean vivo3 = proceso3.isAlive();
                
                System.out.println("Estado de los procesos:");
                System.out.println("   Proceso 1: " + (vivo1 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println("   Proceso 2:  " + (vivo2 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println("   Proceso 3:  " + (vivo3 ? "EJECUTÁNDOSE" : "TERMINADO"));
                System.out.println();
                
                if (!vivo1 && !vivo2 && !vivo3) {
                    hayProcesosVivos = false;
                    System.out.println("¡Todos los procesos han terminado!");
                }
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Códigos de salida:");
            System.out.println("   Proceso 1: " + proceso1.exitValue());
            System.out.println("   Proceso 2: " + proceso2.exitValue());
            System.out.println("   Proceso 3: " + proceso3.exitValue());
            
        } catch (IOException e) {
            System.out.println("Error al crear procesos: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Monitoreo interrumpido: " + e.getMessage());
        }
        
        System.out.println("\n Programa terminado");
    }
}