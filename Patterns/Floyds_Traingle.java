package Patterns;

public class Floyds_Traingle {
    public static void main(String argsp[]){

        int rows = 5;
        int num = 1;

        for(int i = 1; i <= rows;i++){

            for(int j = 1; j <= i;j++){
                System.out.print( num++ +" ");
            }
            System.out.println();

        }

    }
}
