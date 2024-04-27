// We can also make this algo, with the time when we are getting
// Input from user, as if j < i:
// Means the user has already inputed the above row's values
// Now we can perform swapping


package Scaler;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows of matrix : ");
        byte size = sc.nextByte();

        int[][] arr = new int[size][size];

        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                arr[i][j] = sc.nextInt();

                if( j < i){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        
        System.out.println("\nTransposed Array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }


    public void transposeMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("\nTransposed Array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
