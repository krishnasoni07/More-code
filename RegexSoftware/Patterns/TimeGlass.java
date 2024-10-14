package RegexSoftware.Patterns;

public class TimeGlass {

    public static void main(String args[]){

        int num = 5;

        for(int i = 1; i <= num * 2 - 1; i++){

            for(int j = 1; j <= num * 2 - 1;j++)
                if( ( j < i && i <= num ) || ( j > num * 2 - i && i <= num ) || ( i > num && j < num - (i - num) ) || ( i > num && j > num + (i - num) ))
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();
        }

    }
    
}
