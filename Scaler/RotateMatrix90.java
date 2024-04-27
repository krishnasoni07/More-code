package Scaler;
import java.util.Scanner;

public class RotateMatrix90 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows of Matrix : ");
        Byte size = sc.nextByte();

        int arr[][] = new int[size][size];

        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                arr[i][j] = sc.nextInt();

                if( j < i ){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        System.out.println("Rotated Array is : ");
        for(int i = 0; i < arr.length;i++){
            for(int j = arr.length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
