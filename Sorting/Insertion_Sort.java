package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = new int[]{ 5, 7, 9, 4, 6, 8, 1, 2, 3};

        insertionSort(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }

    public static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int currentElement = i;
            if( arr[currentElement] < arr[i - 1]  ){

                for( int j = i; j >= 0;j-- ){
                    arr[j] = arr[j - 1];
                }
                
            }

        }

    }
}

// 2 , 3 , 1 , 5 , 4
