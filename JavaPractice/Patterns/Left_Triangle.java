package JavaPractice.Patterns;

public class Left_Triangle {
    public static void main(String args[]){
        int rows = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i < rows;i++){
            for(int j = 0; j < rows;j++){
                if( j < rows - i - 1 )
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
