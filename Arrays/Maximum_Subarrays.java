package Arrays;
import java.util.ArrayList;

class Maximum_Subarrays{
    public static void main(String ...args){
        ArrayList<Integer> arr = new ArrayList<Integer>();


        // Test case 1
        arr.add(-2);
        arr.add(1);
        arr.add(-3);
        arr.add(4);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        arr.add(-5);
        arr.add(4);

        // Test case 2
        // arr.add(5);
        // arr.add(4);
        // arr.add(-1);
        // arr.add(7);
        // arr.add(8);

        // [-2,1,-3,4,-1,2,1,-5,4
        // [5,4,-1,7,8]

        System.out.println( maximumSubarrays(arr) );


    }

    public static int maximumSubarrays( ArrayList<Integer> arr ){

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.size();i++){
            sum += arr.get(i);
            if( sum > max ) max = sum;
        }

        return max;

    }
}