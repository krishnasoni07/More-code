package Bits;

public class Flipping_Bits {
    public static void main(String args[]){

        long l = 2147483647l;

        String str = Long.toBinaryString(l);
        String rstr = "";
        for( int i = 0; i < str.length();i++ ){
            if( str.charAt(i) == '0' )
                rstr += '1';
            else
                rstr += '0';
        }

        System.out.println( Long.parseLong(rstr , 2) );
    }
}
