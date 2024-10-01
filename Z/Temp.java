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

        // StringBuffer s = new StringBuffer("");

        // s.append(5.666);
        // s.insert(2000, 0);

        // System.out.println(s);

        // String s = "krisHna";

        // String l = "";

        // for(int i = 0; i < s.length();i++){

        //     if( s.charAt(i) >= "a" && s.charAt(i) <= "z") 
        //     l = l + (char)(s.charAt(i) - 32);
        //     else
        //         l += s.charAt(i);
        // }
        // System.out.println(l);


        // String toReverse = "avaj2c";

        // String reversed = "";

        // for(int i = toReverse.length() - 1; i >= 0;i--)
        //     reversed += toReverse.charAt(i);

        // System.out.println(reversed);

        // int data[] ={1,2,3} ;
        // int key = 2014;
        // int count=0;
        // for(int e:data){
        //     if(e!=key){
        //         continue;
        //         // count++;
        //     }
        // }
        // System.out.println(count+" found");

        // String[] arr = {"A","B","C","D"};
        // for(int i = 0; i < arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        //     if(arr[i].equals("C"))
        //         continue;
        //     System.out.println("Work done");
        //     break;

        // }
        // writeln("krishna");

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