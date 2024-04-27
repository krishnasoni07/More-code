

class MyException extends Exception{
    // public String toString(){
    //     return "Hell";
    // }
}


class Thread1 extends Thread{
    static int i = 1;

    static{
        Thread1 t = new Thread1();
        t.start();
    }

    public void run(){
        main( new String[3] );
    }

    public static void main(String[] args) {

        while (i++ < 200) {

            if( i == 200 )
                try{
                    throw new MyException();
                }
                catch( MyException e ){
                    System.out.println(e);
                }
            System.out.println("Hello world! " + i );

        }
    }
}