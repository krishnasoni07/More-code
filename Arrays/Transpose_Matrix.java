package Arrays;

public class Transpose_Matrix {
    public static void main(String args[]){
        int a[][] = new int[][] { {1,2,3} , { 4,5,6 } };

        int b[][] = new int[ a[0].length ][ a.length ];

        for( int i = 0; i < b.length;i++){
            for(int j = 0;j < b[i].length;j++){

                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

        }
    }

}
