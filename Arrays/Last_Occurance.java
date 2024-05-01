package Arrays;

public class Last_Occurance {
    public static void main(String args[]){
        int arr[] = new int[] {100,5,69,51,5,4,6,2,1,95,8,7,3,5,6,1,5,4,9,1,5,3,56,78};

        System.out.println( lastOccurance( arr, arr.length , 100 ) );
    }

    public static int lastOccurance( int arr[] , int length , int target ){
        if( arr[ length - 1 ] == target) return length - 1;
        if( length - 1 == 0 ) return - 1;

        return lastOccurance(arr, length - 1, target);
    }
}
