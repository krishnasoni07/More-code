package Patterns;

public class Inverted_Right_Half_Pyramid {
    public static void main(String args[]){

        int rows = 15;

        for(int i = rows; i >= 1;i--){

            for(int j = 1; j <= i;j++)
                System.out.print("*");
            System.out.println();

        }

    }
}
