package Z;

public class Student_Challenge3 {
    public static void main(String args[]){

        String str = new java.util.Scanner(System.in).next();

        System.out.println( str.matches( "[A|B|C|D|E|F|0-9]*" ) );

    }
}
