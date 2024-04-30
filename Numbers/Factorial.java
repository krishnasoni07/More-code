package Numbers;

public class Factorial {
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number "); int num = sc.nextInt();

        System.out.println( getFactorial(num) );

        sc.close();

    }

    public static int getFactorial(int num){
        if( num == 1 )
            return 1;
        return num * getFactorial( num - 1);
    }
}
