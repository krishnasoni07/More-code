package Patterns;

public class Left_Half_Pyramid {
    public static void main(String args[]){

        int rows = 7;

        for(int i = 1; i <= rows;i++){

            for(int j = 1; j <= rows;j++){
                if( j <= (rows - i) ) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }

    }
}
