package Patterns;

public class Inverted_Left_Half_Pyramid {
    public static void main(String args[]){

        int rows = 4;

        for(int i = 1; i <= rows;i++){

            for(int j = 1; j <= rows;j++){

                if( j < i ) System.out.print("  ");
                else System.out.print("* ");

            }
            System.out.println();

        }

    }
}
