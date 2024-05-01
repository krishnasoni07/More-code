package BitManipulation;

public class Even_Odd {
    public static void main(String args[]){

        int num = 11;
        int b = num & 1;
                
        if( b == 1 ) System.out.println("Odd");
        else System.out.println("Even");
    }
}
