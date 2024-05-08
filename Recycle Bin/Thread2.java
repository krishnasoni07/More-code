

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Hello");

        // Dangerous statement, infinite Thread will be made and program will never stop
        // Implicitly
        // new MyThread2().start();
    }
}

public class Thread2 extends Thread  {

    public void run(){}

    public static void main(String[] args) throws InterruptedException{
        Runnable r = () -> {
            System.out.println("Interface's Lamba Exression");
        };

        Thread t = new Thread( r );
        
        t.start();
        Thread2.sleep(2000);

        // Thread.start();
    }

}
