package Patterns;

public class Diamond_Pattern {
    public static void main(String args[]){

        int rows = 6;



        for(int i = 1; i < rows * 2;i++){

            for(int j = 1; j < rows * 2;j++){

                if( i <= rows && ( j <= rows - i || j >= rows + i) )
                    System.out.print(" ");
                else if( i > rows && ( j <= i - rows || j >= ( rows * 2 - ( i - rows ) ) ) )
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();

        }



        // for(int i = 1; i < rows * 2 ;i++){

        //     for(int j = 1; j < rows * 2;j++){

        //         if( (j <= (rows - i) || j >= (rows + i) ) && i <= rows)
        //             System.out.print(" ");
        //         else if( (j <= (i - rows) || j >= ( rows * 2 - (i - rows) )) && i > rows )
        //             System.out.print(" ");
        //         else System.out.print("*");

        //     }
        //     System.out.println();

        // }

    }
}
