
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Creando hilos...");
        
        Contador1 hilo1 = new Contador1();
        Contador10 hilo2 = new Contador10(); 
        Contador100 hilo3 = new Contador100();

        Contador hilo1b =new Contador(1,5,"Contador1");
        Contador hilo2b =new Contador(10,15,"Contador2");
        Contador hilo3b =new Contador(100,105,"Contador3");
        
        System.out.println("Lanzando hilos...");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();

        hilo1b.start();
        hilo2b.start();
        hilo3b.start();
        
        System.out.println("Todos los hilos lanzados");
        
        System.out.println("Hilo principal continúa trabajando...");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
        
        System.out.println("Hilo principal sigue aquí...");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
        
        System.out.println("Hilo principal terminando");
        System.out.println("(Los otros hilos pueden seguir ejecutándose)");
    }
}


class Contador1 extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador-1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Contador-1 interrumpido");
            }
        }
        System.out.println("Contador-1 terminado");
    }
}

class Contador10 extends Thread {
    
    public void run() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Contador-10: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Contador-10 interrumpido");
            }
        }
        System.out.println("Contador-10 terminado");
    }
}


class Contador100 extends Thread {
    
    public void run() {
        for (int i = 100; i <= 105; i++) {
            System.out.println("Contador-100: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Contador-100 interrumpido");
            }
        }
        System.out.println("Contador-100 terminado");
    }
}

class Contador extends Thread {
    int inicio;
    int fin;
    String nombre;

    public Contador(int inicio,int fin,String nombre){
        this.inicio=inicio;
        this.fin=fin;
        this.nombre=nombre;
    }

    public void run() {
        for (int i = inicio; i <= fin ; i++) {
            System.out.println(nombre +": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(nombre+" interrumpido");
            }
        }
        System.out.println(nombre+" terminado");
    }
}