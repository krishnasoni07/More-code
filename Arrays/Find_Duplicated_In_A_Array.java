package Arrays;

public class Find_Duplicated_In_A_Array {
    public static void main(String args[]){

        int arr[] = new int[] { 2,3,1,2,3,4,6,6 };
        int rarr[] = new int[arr.length];

        for(int i = 0; i < arr.length;i++)
            rarr[i] = arr[i];

        for(int i = 0; i < arr.length;i++){
            if( rarr[ arr[i] ] == -1 ) System.out.println(arr[i]);
            else{
                rarr[arr[i]] = -1;
            }
        }

    }
}
