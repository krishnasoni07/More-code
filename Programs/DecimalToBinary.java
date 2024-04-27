package Programs;

import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println( Methods.decimalToBinary( sc.nextInt() ) );
        sc.close();
    }

}