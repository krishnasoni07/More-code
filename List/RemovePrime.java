package List;

import java.util.Scanner;
import java.util.ArrayList;

public class RemovePrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int[] arr = new int[sc.nextInt()];
               
        System.out.println("Enter Elements : ");
        for(int i = 0; i < arr.length;i++)
            arr[i] = sc.nextInt();

        System.out.println("Non prime numbers are : ");
        removePrime(arr);

        int[] A = { 728, 556, 783, 501, 768, 335, 641, 378, 745, 281, 768, 359, 896, 173, 329, 271, 658, 260, 528, 782,
                381, 868, 866, 376, 227 };
                System.out.println("Non prime numbers are : ");
        removePrime(A);
        sc.close();
    }

    public static void removePrime(int[] arr){
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < arr.length;i++){

            if(!isPrime(arr[i])) array.add(arr[i]);

        }
        

        for(int i = 0; i < array.size();i++)
            System.out.println(array.get(i) + " ");

    }

    public static boolean isPrime( int num ){
        boolean flag = true;

        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) {
                flag = false;
                break;        
            }

        return flag;
    }
}