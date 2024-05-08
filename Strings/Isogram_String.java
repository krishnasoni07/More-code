package Strings;
// import java.util.HashMap;
import java.util.HashSet;

public class Isogram_String {
    public static void main(String[] args) {
        
        String s1 = "geeks";

        HashSet<Character> map = new HashSet<Character>();

        for(int i = 0;i < s1.length();i++){

            char ch = s1.charAt(i);

            if( map.contains(ch) ){
                System.out.println("Not a Isogram");
                return;
            }
            else{
                map.add(ch);
            }
        }

        System.out.println("Is a Isogram");


    }    
}
