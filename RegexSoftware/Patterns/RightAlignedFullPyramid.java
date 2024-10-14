package RegexSoftware.Patterns;

public class RightAlignedFullPyramid {

    public static void main(String args[]){

        int num = 6;

        for(int i = 1; i <= num * 2 -1; i++){

            for(int j = 1; j <= num;j++)
                if( (j <= num - i && i <= num) || ( j <= i - num && i > num ) )
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();

        }

    }
    
}
