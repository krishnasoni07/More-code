package BitManipulation;

public class Check_Number_IsPower_2 {
    public static void main(String[] args) {
        int num = 18;
        int bit = num - 1;

        if( (num & bit) == 0 ) System.out.println( "it is a power of 2" );
        else System.out.println( "It is Not a power of 2" );
    }
}
