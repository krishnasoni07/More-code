package Strings;

public class Check_For_Subsequence {
    public static void main(String args[]){
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";

        if( isSubsequence( s1 , s2 , s1.length() , s2.length() ) )
            System.out.println("true");
        else   
            System.out.println("false");

    }

    public static boolean isSubsequence( String s1 , String s2 , int l1 , int l2 ){

        if( l1 == 0 ) return true;
        if( l2 == 0 ) return false;

        if( s1.charAt(l1 - 1) == s2.charAt(l2 - 1) )
            return isSubsequence(s1, s2, l1 - 1, l2 - 1);
        else
            return isSubsequence(s1, s2, l1, l2 - 1);

    }
}
