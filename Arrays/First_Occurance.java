package Arrays;

public class First_Occurance {
    public static void main(String args[]){

        int arr[] = new int[] { 5,6,7,9,4,3,1,2,6,4 };

        System.out.println( firstOccurance( arr , 0 , 100 ) );
    }

    public static int firstOccurance( int arr[] , int i , int target){
        if( arr[i] == target ) return i;
        if( i == arr.length - 1 ) return -1;

        return firstOccurance(arr, i + 1 , target);
    }
}
