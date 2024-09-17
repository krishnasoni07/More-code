package Z;

public class RotateArray {
    public static void main(String args[]){

        int a[]= new int[]{1,2,3,4,5};

        int elementsToRotate = 2;

        for(int j = 1; j <= elementsToRotate;j++){
            int temp = a[0];

            for(int i = 0; i < a.length - 1;i++)
                a[i] = a[i + 1];
            
            a[ a.length - 1 ] = temp;

        }

        for( int i:a )
            System.out.print(i + " ");

    }
}
