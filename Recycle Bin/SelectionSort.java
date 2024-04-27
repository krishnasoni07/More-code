import java.util.Scanner;

public class SelectionSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter " + arr.length + " Elements : ");
        for(Byte i = 0;i < arr.length;i++)
            arr[i] = sc.nextInt();

        arr = selectionSort(arr);

        for(int i = 0; i < arr.length;i++)
            System.out.print( " " + arr[i]);
        sc.close();
    }

   public static int[] selectionSort(int arr[]){
        // Remember j + 1 is crucial statement

        for(int j = 0; j < arr.length - 1;j++){
            int startIndex = j;

            for(int i = j + 1; i < arr.length;i++)
                if( arr[i] < arr[startIndex] ) startIndex = i;
            
            int temp = arr[startIndex];
            arr[startIndex] = arr[j];
            arr[j] = temp;
        }


        return arr;
    }
}