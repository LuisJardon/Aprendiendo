import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        int num2 = scanner.nextInt();
        
        try {
            String operacion = num1 + " + " + num2;
            
            System.out.println("\n Calculando " + operacion + " en proceso separado...");
            
            ProcessBuilder builder = new ProcessBuilder("powershell", "-Command", operacion);
            
            Process proceso = builder.start();
            
            BufferedReader lector = new BufferedReader(
                new InputStreamReader(proceso.getInputStream())
            );
            
            String resultado = lector.readLine();
            lector.close();
            
            int codigoSalida = proceso.waitFor();
            
            if (codigoSalida == 0) {
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
            } else {
                System.out.println("Error en el cálculo");
            }
            
        } catch (IOException e) {
            System.out.println("Error al ejecutar el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El proceso fue interrumpido: " + e.getMessage());
        }
        
        scanner.close();
        System.out.println("\n Programa terminado");
    }
}