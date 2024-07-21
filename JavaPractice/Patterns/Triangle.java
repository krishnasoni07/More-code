package JavaPractice.Patterns;

public class Triangle {
    public static void main(String args[]){

        int rows = new java.util.Scanner(System.in).nextInt();

        System.out.println();
        for(int i = 01;i <= rows;i++){
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
