package BriskMind;

public class Diamond_Pattern {
    public static void main(String args[]){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number : ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows;i++){

            for(int j = 1; j < rows * 2;j++){
                if( j == rows - i || j == rows + i || i == rows - 1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();

    }
}
