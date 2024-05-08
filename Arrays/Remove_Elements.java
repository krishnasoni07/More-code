package Arrays;
import java.util.ArrayList;

public class Remove_Elements {
    public static void main(String args[]){

        int arr[] = new int[]{ 0, 1, 2, 2, 3, 0, 4, 2};
        int counts[] = new int[51];
        int val = 2;

        for(int i = 0; i < arr.length;i++){
            if( arr[i] != val )
                counts[ arr[i] ]++;
        }

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < counts.length;i++){

            while (counts[i] >= 1) {
                result.add( i );
                counts[i]--;
            }

        }

        for(int i = 0; i < arr.length;i++){

            if( i < result.size() ) arr[i] = result.get(i);
            else{
                arr[i] = -1;
            }
            System.out.print( arr[i] + " " );
        }

    }
}
