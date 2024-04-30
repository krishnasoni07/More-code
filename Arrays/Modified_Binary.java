package Arrays;

public class Modified_Binary {
    public static void main(String[] args) {
        
        int arr[] = new int[] {11,12,16,21,23,1,2,3};
        int target = 3;

        int low = 0;
        int high = arr.length - 1;

        while( low <= high ){
            int mid = (low + high) / 2;

            if( arr[mid] == target ){
                System.out.println("Found");
                System.exit(0);
            }

            if( arr[low] <= arr[mid] ){

                if( arr[low] < target && arr[mid] > target )
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{

                if( arr[mid] < target && target <= arr[high] )
                    low = mid  + 1;
                else
                    high = mid - 1;

            }


        }


    }
}
