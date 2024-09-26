package Z;


class Student{
    // public String toString(){
    //     return "Hello world";
    // }
}

public class Temp{


    public static void main(String args[]){

        // String str = "Krishna";

        // String s = str.intern();

        // System.out.println( str );
        // System.out.println( s );
        // System.out.println( str == s );
        
        // String str = " ";
        // str.trim();
        // System.out.println(str.equals("")+" " + str.isEmpty());

        // String s1 = "krishNa".toLowerCase(); 
        // String s2 = "krishNa".toLowerCase();

        // System.out.println( s1 == s2 );


        // System.out.println( new Student() );

        StringBuffer s = new StringBuffer("");

        s.append(5.666);
        s.insert(2000, 0);

        System.out.println(s);

    }

}

/*
 * 
 * StringBuilder
 * No methods are synchronized
 * At at time more than one thread can operate so it is not ThreadSafe.
 * Threads are not requried to wait so performance is high.
 * Introduced in jdk1.5 version
 * 
 * 
 * String vs StringBuffer vs StringBuilder
 * 
 * String => we opt if the content is fixed and it wont change frequently
 * 
 * StringBuffer => we opt if the content changes frequently but ThreadSafety is required
 * 
 * StringBuilder => we opt if the content changes frequently but ThreadSafety is
 * not required
 * 
 */


































































































// public class Temp{

//     public static void main(String args[]){

//         int i = 10;
//         final int x = 20;

//         switch (i) {
           
//             case 10: System.out.println("ok");
//             case x : System.out.println("okkk");
            
//         }

//     }

// }