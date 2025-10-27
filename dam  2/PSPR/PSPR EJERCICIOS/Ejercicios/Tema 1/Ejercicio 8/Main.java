
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Preparando aventureros para sus misiones...");
        
        Aventurero guerrero = new Aventurero("Guerrero-Valiente");
        Aventurero mago = new Aventurero("Mago-Sabio");
        Aventurero arquero = new Aventurero("Arquero-Certero");
        Aventurero ladron = new Aventurero("Ladrón-Sigiloso");
        
        System.out.println("¡Las aventuras comienzan!");
        System.out.println("Cada aventurero entra a su mazmorra...");
        System.out.println("------------------------------------------");
        
        guerrero.start();
        mago.start();
        arquero.start();
        ladron.start();
        
        System.out.println("El programa principal termina de observar");
        System.out.println("   (Las aventuras épicas continúan...)");
    }
}


class Aventurero extends Thread {
    
    private String nombre;
    private int nivel;
    private int experiencia;
    private String[] enemigos = {
        "Goblin", "Esqueleto", "Orc", "Araña Gigante", 
        "Zombie", "Slime", "¡DRAGÓN!", "Murciélago"
    };
    
    public Aventurero(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experiencia = 0;
    }
    
    public void run() {
        
        System.out.println(nombre + " entra a la mazmorra (Nivel " + nivel + ")");
        
        while (nivel<5) {
            
            String enemigoEncontrado = enemigos[(int)(Math.random() * enemigos.length)];
            
            int expGanada = (int)(Math.random() * 41) + 10;
            
            experiencia += expGanada;
            
            System.out.println(nombre + ": Derroté un " + enemigoEncontrado + 
                             " (+" + expGanada + " EXP) - Total: " + experiencia + " EXP");
            
            if (experiencia >= 100) {
                nivel++;
                experiencia = 0;
                
                System.out.println("¡¡¡" + nombre + " SUBIÓ DE NIVEL!!! Ahora es NIVEL " + nivel);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(nombre + " fue interrumpido celebrando");
                    break;
                }
            }
            
            int tiempoAventura = (int)(Math.random() * 2000) + 1000;
            try {
                Thread.sleep(tiempoAventura);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido en la aventura");
                break;
            }
            
            // Ocasionalmente mostrar estado actual
            if (Math.random() < 0.3) { 
                System.out.println(nombre + " - Nivel: " + nivel + ", EXP: " + experiencia + "/100");
            }
        }
        
        System.out.println(nombre + " sale de la mazmorra");
    }
}