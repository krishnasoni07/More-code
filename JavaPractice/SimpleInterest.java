package JavaPractice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        System.out.println( (amount * (rate / 100) * time) / 100) ;
    }
}
