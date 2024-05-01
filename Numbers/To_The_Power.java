package Numbers;

public class To_The_Power {
    public static void main(String arg[]){

        System.out.println( toPower( 6 , 3) );

    }

    public static int toPower( int num ,int power ){
        if( power == 1 ) return num;
        return num * toPower(num , power - 1);
    }
}
