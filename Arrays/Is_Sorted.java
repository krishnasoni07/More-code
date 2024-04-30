package Arrays;

public class Is_Sorted {
    public static void main(String arg[]){
        int arr[] = new int[]{ 7,1,2,3,4,5 };


        System.out.println( isSorted( arr , 0 ) );

    }

    public static boolean isSorted(int arr[] , int i){
        if( i == arr.length - 1 ) return true;
        if( arr[i] > arr[i + 1] ) return false;

        return isSorted(arr , i + 1);
    }
}
