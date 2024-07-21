package Patterns;

public class alf_Diamond_Pattern_Inverse {
    public static void main(String[] args) {
        
        int rows = 7;

        for(int i = 0; i < rows;i++){
            for(int j = 1; j < rows * 2;j++){

                System.out.print( ( j >= rows - i && j <= rows + i )?"*":" " );

                // if( j >= rows - i && j <= rows + i )
                //     System.out.print("*");
                // else
                //     System.out.print(" ");

            }
            System.out.println();
        }


    }
}
