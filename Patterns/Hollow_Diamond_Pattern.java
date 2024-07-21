package Patterns;

public class Hollow_Diamond_Pattern {
    public static void main(String args[]){

        int rows = 5;

        for(int i = 1; i < rows * 2;i++){

            for(int j = 1; j < rows * 2;j++){

                if( i <= rows && ( j == rows - i + 1 || j == rows + i - 1 ) )
                    System.out.print("*");
                else if( i > rows && ( j == i - rows + 1 || j == rows * 2 - 1 - (i - rows) ) )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
        
        // for(int i = 1; i <= rows * 2 - 1;i++){

        //     for(int j = 1; j <= rows * 2 - 1;j++){
        //         if( (j == rows - i + 1 || j == rows + i - 1) && i <= rows)
        //             System.out.print("*");
        //         else if( (j == i - rows + 1 || j == rows * 2 - 1- (i - rows)) && i > rows )
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

    }
}
