package Strings;
import java.util.ArrayList;


public class Extract_Words {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        
        // String str = "Hello world how are you";
        String str = "how3 are4 Hello1 world2 you5";
        int start = 0;

        for(int i = 0;i < str.length();i++){

            if( str.charAt(i) == ' ' || i == str.length() - 1){
                String temp = "";
                for(int j = start; j <= i;j++)
                    temp += str.charAt(j);
                arr.add(temp);
                i++;
                start = i;
            }

        }

        char index = '1';
        String result = "";

        for(int i = 0; i < arr.size();i++){
            for(int j = 0; j < arr.size();j++){

                System.out.println( arr.get(j).charAt(arr.get(j).length() - 1) );

                if( arr.get( j ).charAt(arr.get(j).length() - 1) == index ){
                    result += arr.get(j);
                    index++;
                }
            }

        }
        System.out.println(arr);
        System.out.println(result);
        System.out.println(index);
    }
}
