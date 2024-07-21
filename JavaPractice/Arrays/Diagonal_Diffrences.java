package JavaPractice.Arrays;



public class Diagonal_Diffrences{

    public static void main(String args[]){

        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < arr.length;i++){

            for(int j = 0; j < arr.length;j++){
                if( j == i ) leftSum += arr[i][j];
                if( j == arr.length - i - 1 ) rightSum += arr[i][j];
            }

        }

        System.out.println( "Left sum = " + leftSum );
        System.out.println( "Right sum = " + rightSum );

    }


}