package RegexSoftware.Patterns;

public class Diamond {

    public static void main(String args[]){

        int num = 5;

        for(int i = 0; i < num * 2 - 1;i++){

            for(int j = 0; j < num * 2 ; j++)
                if( j >= num - i + 1 && j <= num + i + 1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();

        }

    }
    
}
