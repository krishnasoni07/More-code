package Arrays;
import java.util.*;
public class Find_Indexes_of_a_subarray_with_given_sum {
    public static void main(String args[]){

        int arr[] = new int[] { 2, 5,1, 3, 4, 5, 6};
        int num =10;

        List<Integer> sums = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length;i++){

            sum += arr[i];
            if( sum == num )
                System.out.println("Found it");

        }

    }
}
