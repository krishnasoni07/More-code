package Strings;
import java.util.HashMap;

public class Remove_common_characters_and_concatenate {
    public static void main(String[] args) {
        
        String s1 = "abcs";
        String s2 = "cxzca";

        HashMap<Character,Integer> map1 =  new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        for(int i = 0; i < s2.length();i++){
            char ch = s2.charAt(i);
            if( map1.containsKey(ch) ) continue;
            else map1.put(ch, 1);
        }

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map2.containsKey(ch))
                continue;
            else
                map2.put(ch, 1);
        }        

        String result = "";

        for(int i = 0; i < s1.length();i++){
            char ch = s1.charAt(i);
            if( map1.containsKey(ch) )continue;
            else{
                result += ch;
            }
        }

        for(int i = 0; i < s2.length();i++){
            char ch = s2.charAt(i);
            if( map2.containsKey(ch) ) continue;
            else result += ch;
        }

        System.out.println(result);
    }
}
