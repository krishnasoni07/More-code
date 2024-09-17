package Z;

public class Student_Challenge5 {
    public static void main(String args[]){

        String str = new java.util.Scanner(System.in).next();

        if(  str.matches("(0|1)*")  )
            System.out.println( "It supports base 2" );
        if( str.matches("[A-F0-9]*") )
            System.out.println("It supports base 16");
        if( str.matches("[0-7]*") )
            System.out.println("It supports base 8");
        if( str.matches("[0-9]*") )
            System.out.println("It supports base 10");

    }
}
