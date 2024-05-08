package Arrays;

public class Rotate_Array {
    public static void main(String args[]){

        int arr[] = new int[] { -1, -2, -3, 4, 5, 6, 7};
        int d = 2;

        while (d-- != 0) {
            int temp = arr[0];
            for(int i = 0; i < arr.length - 1;i++)
                arr[i] = arr[i+1];
            arr[arr.length - 1] = temp;
        }

        for(int i = 0; i < arr.length;i++)
        System.out.print(arr[i] + " ");
    }
}




// int tempArr[] = new int[d];

// for(int i = 0; i < d;i++) tempArr[i] = arr[i];

// for(int i = 0; i < d;i++){
//     for(int j = 0; j < arr.length - 1;j++)
//         arr[j] = arr[j+1];
// }
// int k = 0;
// for(int i = arr.length - d; i < arr.length;i++)
//     arr[i] = tempArr[k++];