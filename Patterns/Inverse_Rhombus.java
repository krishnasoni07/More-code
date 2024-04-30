package Patterns;

public class Inverse_Rhombus {
    public static void main(String[] args) {
        
        int rows = 4;

        for(int i = 0; i < rows;i++){

            for(int j = rows - i - 1; j > 0; j--)
                System.out.print("s");
            for(int j = 1; j <= rows;j++)
                System.out.print("*");

            System.out.println();

        }


    }
}
