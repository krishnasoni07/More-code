package Patterns;

public class Hourglass_Pattern{
    public static void main(String args[]){

        int rows = 5;

        for(int i = 1; i <= rows * 2 - 1;i++){

            for(int j = 1; j <= rows ;j++){
                if( j <= i && i <= rows )
                    System.out.print("   ");
                else if( j <= rows - i - rows && i > rows)
                    System.out.print("   ");
                else
                    System.out.print("   *   ");
            }
            System.out.println();
        }  

    }
}