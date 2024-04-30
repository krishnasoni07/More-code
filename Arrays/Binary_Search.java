package Arrays;

import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add( 10 );
        arr.add( 20 );
        arr.add( 30 );
        arr.add( 40 );
        arr.add( 50 );
        arr.add( 60 );
        arr.add( 70 );

        System.out.println( binarySearch(arr,21) );
    }

    public static boolean binarySearch( ArrayList<Integer> arr , int num ){

        int start = 0;
        int end = arr.size() - 1;
        int mid = (start + end) / 2;

        while( start <= end ){
            if( arr.get(mid) == num) return true;
            if( arr.get(mid) > num ) end = mid - 1;
            if( arr.get(mid) < num ) start = mid + 1;

            mid = (start + end) / 2;
        }

        return false;
    }
}
