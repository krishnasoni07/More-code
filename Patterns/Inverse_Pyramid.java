package Patterns;

public class Inverse_Pyramid {
    public static void main(String[] args) {
        
        int rows = 8;
        int mid = rows - 1;

        for(int i = 0; i < rows;i++){

            for(int j = 0; j < rows * 2 - 1; j++){

                if( j < i || j > rows * 2 - 2 - i)
                    System.out.print(" ");
                else    
                    System.out.print("*");


            }
            System.out.println();

        }


    }
}
