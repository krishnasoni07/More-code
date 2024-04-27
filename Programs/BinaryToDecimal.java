package Programs;
import java.util.Scanner;


public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println( Methods.binaryToDecimal(sc.next()) );

        sc.close();
    }
}
