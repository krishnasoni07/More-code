package Arrays;

import java.util.ArrayList;

public class Print_Subarrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(-2);
        arr.add(6);
        arr.add(-1);
        arr.add(3);
        // arr.add(60);

        printSubarrays(arr);
    }

    public static void printSubarrays( ArrayList<Integer> arr ){

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxxSum = Integer.MIN_VALUE;

        System.out.println();
        System.out.println();
        for(int i = 0; i < arr.size();i++){
            
            for(int j = i + 1; j < arr.size();j++){

                System.out.print("[ ");
                for(int k = i; k <= j;k++){
                    System.out.print( "," + arr.get(k));
                    sum += arr.get(k);
                }
                System.out.print("]");

                if( sum > maxxSum ) maxxSum = sum;
                if( sum > max ) max = sum;
                if( sum < min ) min = sum;
                sum = 0;
                System.out.print( max + " " + min );                
            }
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;

            
            System.out.println();

        }
        System.out.println("Maximum Subarray sum : " + maxxSum);
        System.out.println();
        System.out.println();
    }
}
