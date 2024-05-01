package Sorting;

public class Counting_Sort {
    public static void main(String[] args) {
        
        int a[] = new int[]{2,0,0,2,2,1,2,1,2,0,0,2,1,0,2,1,2,0,1,2,0,0,2,0,2,2,2,1,1,0,1,1,0,1,0,2,0,0,2,1,2,0,1,2,2,2,1,1,0,0,1,2,1};

        int arr[] = new int[3];
        
        for(int i = 0; i < a.length;i++){
            arr[ a[i] ]++;
        }
        
        for(int i = 0; i < arr.length;i++){
            
            while( arr[i] > 0 ){
                System.out.print( i + " " );
                arr[i]--;
            }
            
        }

    }
}
