import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {
        // ArrayList<Integer> a = new ArrayList<>();

        int r = 5;

        for(int i = 0; i < r;i++){
            for(int j = 0; j < r ;j++){
                    if( j < (r / 2) - i || j > (r / 2) + i) System.out.print(" ");
                    else System.out.print("*");
            }

            for(int j = r - 1; j >= 0; j--){

            }
            System.out.println();
        }
                    
        
    }

    public static void reverseArray(int a[]) {
        /*
         * int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
         * 
         * reverseArray(a);
         * 
         * for(int i = 0; i < a.length;i++)
         * System.out.println(a[i]);
         * 
         */


        for(int i = 0,j = a.length - 1; i < a.length / 2 + 1;i++ , j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static int findMedian(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            int curr = i;

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(curr))
                    curr = j;
            }

            int temp = arr.get(curr);
            arr.set(curr, arr.get(i));
            arr.set(i, temp);

        }

        return arr.get(arr.size() / 2);

    }

    public static int[] selectionSort(int arr[]) {
        // Remember j + 1 is crucial statement

        for (int j = 0; j < arr.length - 1; j++) {
            int startIndex = j;

            for (int i = j + 1; i < arr.length; i++)
                if (arr[i] < arr[startIndex])
                    startIndex = i;

            int temp = arr[startIndex];
            arr[startIndex] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static int lonelyinteger(List<Integer> a) {
        int num = 0;

        for (int i = 0; i < a.size(); i++)
            num ^= a.get(i);

        return num;
    }
}

// a.add(1);
// a.add(1);
// a.add(2);
// a.add(2);
// a.add(5);
// a.add(6);
// a.add(6);

// a.add(0);
// a.add(4);
// a.add(2);
// a.add(6);
// a.add(5);
// a.add(1);
