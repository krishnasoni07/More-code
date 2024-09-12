package Z;

import java.util.Scanner;


public class Prime {
    public static void main(String arfs[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 2; i <= Math.sqrt(num);i++){
            if( num % i == 0 ){
                System.out.println("Not a Prime");
                System.exit(0);
            }
        }

        System.out.println("It is a Prime");

    }
}
