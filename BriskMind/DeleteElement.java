package BriskMind;

public class DeleteElement {
    public static void main(String ...args){
        int arr[] = new int[] {56,10,10,10,10,10};

        int lastIndex = arr.length - 1;

        for(int i = 0; i <= lastIndex;i++){

            while (arr[lastIndex] == 10) {
                arr[lastIndex] = 0;
                lastIndex--;
            }

            if( arr[i] == 10 ){
                int temp = arr[lastIndex];
                arr[lastIndex] = 0;
                arr[i] = temp;
                lastIndex--;
            }
        }

        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
