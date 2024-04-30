package Patterns;

public class Hollow_Inverse_Pyramid {
    public static void main(String[] args) {
        int rows = 5;


        for(int i = 0; i < rows;i++){

            for(int j = 0; j < rows * 2 - 1; j++){

                if( i == 0 || j == i || j == rows * 2 - 2 - i )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}
