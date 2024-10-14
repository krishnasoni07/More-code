package RegexSoftware.Patterns;

class Pyramid{
    public static void main(String args[]){
        int num = 7;

        for(int i = 0; i < num;i++){
            for(int j = 0; j < num * 2 - 1;j++){

                if( j >= num - i - 1 && j <= num + i - 1 )
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}