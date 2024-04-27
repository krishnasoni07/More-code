package LambdaExpressions;
    class ae {
        public static void main(String[]... args) {
            java.util.Scanner sc = new java.util.Scanner(System.in);

        try{
            int a[] = new int[sc.nextInt()];
            a[sc.nextInt()] = sc.nextInt();
        }
        catch( NegativeArraySizeException nase ){
            System.out.println("1");
        }
        catch( ArrayIndexOutOfBoundsException nase ){
            System.out.println("12");
        }
        // System.out.println("hello");
        catch( Exception nase ){
            System.out.println("123");
        }
        
        sc.close();
    }
}

/**
 * e
 */
public class e {

    public static void main(String[] args) {

        try{
            A ar = new A();            
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("ok");
        }
    }
}

class A{
   int a[] = new int[-1];
}