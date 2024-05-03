package Patterns;

public class Hollow_Inverted_Full_Pyramid {
    public static void main(String args[]){

        int rows = 5;

        for(int i = 1; i <= rows;i++){
            for(int j = 1; j <= rows * 2 - 1;j++){

                if( j == i || j == rows * 2 - i || i == 1 )
                    System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println();
        }

    }
}
