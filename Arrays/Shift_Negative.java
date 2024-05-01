package Arrays;

public class Shift_Negative {
    public static void main(String args[]){

        int arr[] = new int[] {-1,2,2,5,-3,-4,0,-7};

        int j = 0;
        int temp;

        for(int i = 0; i < arr.length;i++){

            if( arr[i] < 0 ){

                if( i != j ){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

        }

        for(int i : arr)
            System.out.print(i + " ");


    }
}
