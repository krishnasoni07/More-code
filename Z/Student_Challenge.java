package Z;

public class Student_Challenge {

    public static void main(String args[]){

        String str = "Programmer@gmail.com";

        String name = str.substring(0,str.indexOf("@"));
        String domainName = str.substring(str.indexOf("@") , str.lastIndexOf("."));

        System.out.println( str.matches( "[a-zA-z]*@gmail.com" ) );
        System.out.println( "Name  :  " + name );
        System.out.println( "Domain name is @gmail ? :  " + domainName.matches("@gmail") );


    }
    
}
