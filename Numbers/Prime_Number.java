package Numbers;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // System.out.println("Please enter a number : ");
        // int num = sc.nextInt();

        printPrime(1, 20);
        
    }

    public static void printPrime( int start , int end ){

        for(  ; start <= end;start++ ){
            int num = start;
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++)
                if (num % i == 0) {
                    isPrime = false;
                    break;

                }

            if (isPrime)
                System.out.println(" It is a prime number " + num);
            else
                System.out.println("It is not a prime number");

        }

    }
}
