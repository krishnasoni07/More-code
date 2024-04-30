package Patterns;

public class Hollow_Pyramid {
    public static void main(String[] args) {
        
        int rows = 7;

        int mid = rows - 1;

        for(int i = 0; i < rows;i++){

            for(int j = 0 ; j < rows * 2 - 1; j++){

                if( i == rows - 1 || j == (mid - i) || j == (mid + i) )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }

            System.out.println();

        }

    }
}
