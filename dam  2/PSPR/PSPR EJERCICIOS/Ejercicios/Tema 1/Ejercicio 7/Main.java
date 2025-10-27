
public class Main {
    
    public static void main(String[] args) {
         
        Mago magoFuego = new Mago("Mago-Fuego");
        Mago magoHielo = new Mago("Mago-Hielo");
        Mago magoRayo = new Mago("Mago-Rayo");
        Mago magoTierra = new Mago("Mago-Tierra");
        
        System.out.println("¡Los dragones aparecen en diferentes pueblos!");
        System.out.println("¡Comienzan las batallas simultáneas!");
        System.out.println("------------------------------------------");
        
        magoFuego.start();
        magoHielo.start();
        magoRayo.start();
        magoTierra.start();
        
        System.out.println("El programa principal termina de observar");
        System.out.println("   (Las batallas mágicas pueden continuar...)");
    }
}


class Mago extends Thread {
    
    private String nombre;
    private int vidaDragon;
    
    public Mago(String nombre) {
        this.nombre = nombre;
        this.vidaDragon = 100; 
    }
    
    public void run() {
        
        System.out.println("¡" + nombre + " encuentra a su dragón!");
        
        while (vidaDragon > 0) {
            
            int dano = (int)(Math.random() * 16) + 5;
            
            vidaDragon -= dano;
            
            if (vidaDragon < 0) {
                vidaDragon = 0;
            }
            
            System.out.println(nombre + " lanza hechizo - Daño: " + dano + 
                             " (Vida de su dragón: " + vidaDragon + ")");
            
            if (vidaDragon <= 0) {
                System.out.println("¡" + nombre + " ha derrotado a su dragón!");
                break;
            }
            
            try {
                Thread.sleep(400); 
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido en la batalla");
                break;
            }
        }
        
        System.out.println(nombre + " termina su batalla individual");
    }
}