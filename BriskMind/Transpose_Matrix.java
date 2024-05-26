package BriskMind;

public class Transpose_Matrix {
    public static void main(String args[]){
        // int a[][] = new int[][] { {1,2,3} , { 4,5,6 } , {7,8,9} };
        int a[][] = new int[][] { {1,2,3,4} , { 5,6,7,8 } , {9,10,11,12} , {13,14,15,16} };

        int start = 0;

        for(int i = 0; i < a.length;i++){
            for(int j = start; j < a.length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
            start++;
        }

        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // int b[][] = new int[ a[0].length ][ a.length ];

        // for( int i = 0; i < b.length;i++){
        //     for(int j = 0;j < b[i].length;j++){

        //         b[i][j] = a[j][i];
        //         System.out.print(b[i][j] + " ");
        //     }
        //     System.out.println();

        // }
    }

}
