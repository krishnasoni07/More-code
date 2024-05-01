package Arrays;

public class Get_Duplicate {
    public static void main(String[] args) {
        
        int arr[] = new int[] {5,1,4,2,6,3,2};

        int ans = -1;

        for(int i = 0; i < arr.length - 1;i++){

            int index = ( arr[i] < 0 )? ~arr[i] : arr[i];

            if( arr[index] < 0 ){
                ans = arr[index];
            }

        }

        System.out.println(ans);
    }
}
