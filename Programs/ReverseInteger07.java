package Programs;

import java.util.Scanner;

public class ReverseInteger07 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println( Methods.reverseInteger(sc.nextInt()) );
        sc.close();

    }
}
