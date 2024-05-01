package Strings;

public class Palindrome {
    public static void main(String args[]){

        String str = "a";
        boolean flag = true;

        for(int i = 0; i < str.length() / 2; i++){
            if( str.charAt(i) != str.charAt(str.length() - i - 1) ){
                System.out.println("It is not a Palindrome");
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("It is a Palindrome");

    }
}
