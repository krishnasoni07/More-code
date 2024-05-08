package Arrays;

public class Search_Insert_Position {
    public static void main(String args[]){

        int arr[] = new int[] {1,3,5,6,9,15,16,18,19,22,27};

        System.out.println( binarySearch(arr , 24));

    }

    public static int binarySearch(int arr[] , int value){

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if( arr[mid] == value ) return mid;
            if( arr[mid] < value ) start = mid + 1;
            if( arr[mid] > value ) end = mid - 1;
            mid = start + (end - start) / 2;
        }

        return mid + 1;
    }

}
