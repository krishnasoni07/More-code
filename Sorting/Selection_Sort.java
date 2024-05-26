package Sorting;

public class Selection_Sort {
    
    public static void main(String args[]){

        int arr[] = new int[] {5,7,9,4,6,8,1,2,3};

        selectionSort(arr);

        for(int i: arr)
            System.out.println(i);

    }

    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1;i++){
            int currentElement = i;

            for(int j = i + 1; j < arr.length;j++)
                if( arr[currentElement] > arr[j] ) currentElement = j;
            if( currentElement == i ) continue;
            int temp = arr[currentElement];
            arr[currentElement] = arr[i];
            arr[i] = temp; 
        }

    }

    public static void selectionSort1(int arr[]){

    //     for(int i = 0; i < arr.length -1;i++){
    //         int index = i;

    //         for(int j = i + 1; j < arr.length;j++){
    //             if( arr[j] < arr[index] ) index = j;
    //         }

    //         int temp = arr[index];
    //         arr[index] = arr[i];
    //         arr[i] = temp;
    //     }

    }

}
