package Z;

public class Inverted {
    public static void main(String args[]){
        
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int rows = sc.nextInt();

        for(int i = 1; i <= rows;i++){

            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
                System.out.print("*");

            System.out.println();
        }


    }
}
