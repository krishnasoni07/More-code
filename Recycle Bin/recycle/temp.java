package recycle;


public class temp{
    public static void main(String[] args) throws Exception {
        String str =  new String("J");

        System.out.println( str instanceof String );
        System.out.println( str instanceof Object );
        System.out.println( new Object()  instanceof String );
        System.out.println( new Object() instanceof Object );

        // Class c = Class.forName(args[0]);

        // System.out.println( c.isInstance( "String" ) );




    }
}