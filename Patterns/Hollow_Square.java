package Patterns;

public class Hollow_Square {
    public static void main(String args[]){

        int rows = 6;

        for(int i = 1;i <= rows;i++){

            for(int j = 1; j <= rows;j++){
                if( j == 1 || j == rows || i == 1 || i == rows ) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
