package BitManipulation;

public class Get_Ith_Bit {
    public static void main(String args[]){
        int num = 10;

        int bit = (num >> 2) & 1;

        System.out.println( (bit == 1)? "It is On" : "It is Off" );

    }
}
