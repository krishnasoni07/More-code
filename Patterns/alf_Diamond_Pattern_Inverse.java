package Patterns;

public class alf_Diamond_Pattern_Inverse {
    public static void main(String[] args) {
        
        int rows = 7;

        for( int i = 0; i < rows * 2 - 1; i++){

            int spaces = ( i < rows )? i : rows - i;

            for(int j = 0; j < rows; j++){
                if( j < rows - spaces - 1 )
                    System.out.print(" ");
                else   
                    System.out.print("*");

            }
            System.out.println();

        }


    }
}
