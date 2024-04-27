import javax.sound.midi.Soundbank;

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Hello");

        // Dangerous statement, infinite Thread will be made and program will never stop
        // Implicitly
        // new MyThread2().start();
    }
}

public class Thread2 implements Runnable{

    public void run(){}

    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Interface's Lamba Exression");
        };

        Thread t = new Thread( r );
        
        t.start();
        Thread2.sleep(5000);

        // Thread.start();
    }

    public static void sleep( long l ){
        System.out.println("Sleep is overridden");
    }
}
