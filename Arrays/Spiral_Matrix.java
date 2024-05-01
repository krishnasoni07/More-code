package Arrays;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int a[][] = new int[][] { {  1,  2,  3,  4, 5 }, 
                                  { 16, 17, 18, 19, 6 },
                                  { 15, 24, 25, 20, 7 },
                                  { 14, 23, 22, 21, 8 },
                                  { 13, 12, 11, 10, 9 } };

        int sc = 0 , sr = 0;
        int ec = a[0].length - 1, er = ec;



        while( sr <= er && sc <= ec){

            for( int i = sc; i <= ec;i++)
                System.out.print( a[sr][i] + " ");

            for(int i = sr + 1; i <= er;i++)    
                System.out.print( a[i][ec] + " ");

            for(int i = ec - 1; i >= sc; i--)
                System.out.print( a[er][i] + " " );

            for( int i = er - 1; i >= sr + 1;i-- )
                System.out.print( a[i][sc] + " " );

            sc++;
            ec--;
            sr++;
            er--;
        }
    }
}
