package Patterns;

public class Full_Pyramid {
    public static void main(String args[]){

        int rows = 7;

        for(int i = 1; i <= rows;i++){

            for(int j = 1; j <= rows * 2 - 1;j++){

                if( j <= (rows - i) || j >= (rows + i) )
                    System.out.print(" ");
                else System.out.print("*");

            }
            System.out.println();

        }

    }
}
