package Arrays;

public class Merge_Sorted_Array {
    public static void main(String args[]){

        // int arr1[] = new int[] { 1, 2, 3, 4 , 5 , 0, 0, 0};
        // int arr2[] = new int[] {2 , 5 , 6};
        int arr1[] = new int[] {6};
        int arr2[] = new int[] {0};
        int index = 0;


        if( arr1.length == 1 ){
            if( arr1[0] == 0 )
                arr1[0] = arr2[0];
        }
        else if( arr2.length == 1 ){
            for(int j = arr1.length - 2; j >= 0;j--){
                arr1[j + 1] = arr1[j];
            }
            arr1[0] = arr2[0];
        }
        
        else
            for(int i = 0; i < arr1.length;i++){

                if(arr2[index] < arr1[i] || arr1[i] == 0){
                    for(int j = arr1.length - 2; j >= i;j--){
                        arr1[j + 1] = arr1[j];
                    }
                    arr1[i] = arr2[index++];
                }

            }

        for(int i = 0; i < arr1.length;i++)
            System.out.print( arr1[i] + " " );
    }
}
