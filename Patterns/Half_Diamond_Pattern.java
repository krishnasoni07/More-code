package Patterns;

public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        
        int rows = 7;

        for(int i = 0; i < rows * 2 - 1; i++){

            int stars = ( i < rows )? i + 1 : rows - ( i - rows ) - 1 ;

            for( int j = 1; j <= stars;j++)
                System.out.print("*");

            System.out.println();

        }


    }
}
