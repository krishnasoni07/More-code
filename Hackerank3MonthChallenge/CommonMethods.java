package Hackerank3MonthChallenge;

import java.util.Scanner;

public class CommonMethods {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput(){
        int arr[] = new int[sc.nextInt()];

        for(int i = 0; i < arr.length;i++)
            arr[i] = sc.nextInt();

        return arr;
    }
    
}
