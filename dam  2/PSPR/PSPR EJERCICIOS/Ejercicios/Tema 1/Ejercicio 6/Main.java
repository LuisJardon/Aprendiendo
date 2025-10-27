
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Preparando corredores...");
        
        //Son todos iguales por lo que solo hacemos una clase
        Corredor corredor1 = new Corredor("Corredor-1");
        Corredor corredor2 = new Corredor("Corredor-2"); 
        Corredor corredor3 = new Corredor("Corredor-3");
        Corredor corredor4 = new Corredor("Corredor-4");
        
        System.out.println("¡Comienza la carrera!");
        System.out.println("----------------------------");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        
        System.out.println("Hilo principal termina su trabajo");
        System.out.println("   (Los corredores pueden seguir corriendo)");
    }
}


class Corredor extends Thread {
    
    private String nombre;
    private int metros;
    private int meta;
    
    public Corredor(String nombre) {
        this.nombre = nombre;
        this.metros = 0;
        this.meta = 50;
    }
    
    public void run() {
        
        while (metros < meta) {
            
            // Avanzar una cantidad aleatoria (1-8 metros)
            int avance = (int)(Math.random() * 8) + 1;
            metros += avance;
            
            // Si se pasa de la meta, ajustar
            if (metros > meta) {
                metros = meta;
            }
            
            System.out.println(nombre + ": " + metros + " metros");
            
            // Si llegó a la meta, anunciarlo
            if (metros >= meta) {
                System.out.println("¡" + nombre + " ha llegado!");
                break;
            }
            
            // Pausa antes del siguiente avance
            try {
                Thread.sleep(200); // Pausa 200ms
            } catch (InterruptedException e) {
                System.out.println(nombre + " interrumpido");
                break;
            }
        }
        
        System.out.println( nombre + " terminó con " + metros + " metros");
    }
}