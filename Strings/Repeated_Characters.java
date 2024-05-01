package Strings;
import java.util.HashMap;
import java.util.Map;

public class Repeated_Characters {
    public static void main(String args[]){
        String str = "eGeeksforGeeks";
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);

            if( map.containsKey(ch) ){
                map.put(ch, map.get(ch) + 1);
            }
            else
                map.put(ch, 1);

        }

        System.out.println("Repeated Characters are : ");
        for( Map.Entry<Character,Integer> iterator : map.entrySet() ){
            System.out.println( iterator.getKey() + " " + iterator.getValue() );
        }


        //Bruteforce Approach: 
        // for(int i = 0; i < str.length();i++){

        //     for(int j = i + 1; j < str.length();j++){
        //         if( str.charAt(i) == str.charAt(j) ){
        //             System.out.println(str.charAt(i));
        //             return;
        //         }
        //     }

        // }
        // System.out.println("#");

    }
}
