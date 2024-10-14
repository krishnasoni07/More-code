package RegexSoftware.Patterns;

public class LeftHalfPyramid {
    public static void main(String args[]){

        int num = 6;

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < num;j++)
                if( j < num - i )
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();
        }

    }
}
