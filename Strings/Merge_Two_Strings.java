package Strings;

public class Merge_Two_Strings {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        String result = "";

        int length = s1.length() + s2.length();
        int i = 0;
        int j = 0;

        while (length != 0) {
        
            if( i < s1.length() )
                result += s1.charAt(i++);
            if( j < s2.length() )
                result += s2.charAt(j++);

            length--;
        }

        System.out.println(result);
    }
}
