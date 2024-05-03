package Patterns;

public class Diamond_Pattern {
    public static void main(String args[]){

        int rows = 20;

        for(int i = 1; i <= rows * 2 - 1;i++){

            for(int j = 1; j <= rows * 2 - 1;j++){

                if( (j <= (rows - i) || j >= (rows + i) ) && i <= rows)
                    System.out.print(" ");
                else if( (j <= (i - rows) || j >= ( rows * 2 - (i - rows) )) && i > rows )
                    System.out.print(" ");
                else System.out.print("*");

            }
            System.out.println();

        }

    }
}
