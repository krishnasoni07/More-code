package Patterns;

public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        
        int rows = 7;

        // for(int i = 0; i < rows * 2 - 1; i++){

        //     int stars = ( i < rows )? i + 1 : rows - ( i - rows ) - 1 ;

        //     for( int j = 1; j <= stars;j++)
        //         System.out.print("*");

        //     System.out.println();

        // }

        // for(int i = 1; i < rows * 2;i++){
        //     for(int j = 1; j <= rows;j++){
        //         if( i <= rows && ( j == 1 || j == i ) )
        //             System.out.print("*");
        //         else if( i > rows && ( j == 1 || j == rows - ( i - rows ) ) )
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i < rows * 2;i++){

            for(int j = 1; j <= rows;j++){

                if( i <= rows && ( j == 1 || j == i ) )
                    System.out.print(j);
                else if( i > rows && ( j == 1 || j == rows - ( i - rows )) ) 
                    System.out.print(j);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
