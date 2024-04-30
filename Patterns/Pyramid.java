package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        
        int rows = 7;

        for(int i = 0; i < rows;i++){
            int mid = rows - 1;

            for(int j = 0; j < rows * 2 - 1;j++){

                if( j >= ( mid - i ) && j <= (mid + i) )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }




        // int rows = 4;

        // for(int i = 1; i <= rows;i++){

        //     for( int j = i; j <= rows;j++ )
        //         System.out.print(" ");
        //     for(int j = 1; j <= i * 2 - 1;j++)
        //         System.out.print("*");
        //     System.out.println();

        // }

    }
}
