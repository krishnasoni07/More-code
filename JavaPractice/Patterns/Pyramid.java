package JavaPractice.Patterns;

public class Pyramid {
    public static void main(String args[]){
        int rows = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i < rows;i++){
            for(int j = 1; j < rows * 2;j++){
                if( j >= rows - i && j <= rows + i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
