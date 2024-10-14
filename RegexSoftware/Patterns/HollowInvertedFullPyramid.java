package RegexSoftware.Patterns;

public class HollowInvertedFullPyramid {

    public static void main(String args[]){

        int num = 7;

        for(int i = 1; i <= num; i++){

            for(int j = 1; j <= num * 2 - 1;j++){

                if( i == 1 || j == i || j == num * 2 - i )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }

    }
    
}
