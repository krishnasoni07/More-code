package JavaPractice.Patterns;

public class Diamond {
    public static void main(String args[]){
        int rows = 5;

        for(int i = 1; i < rows * 2 ;i++){
            for(int j = 1;j < rows * 2;j++){
                if( ( j >= rows - i || j <= rows + i) && i <= rows)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
