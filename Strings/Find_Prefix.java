package Strings;

public class Find_Prefix {
    public static void main(String args[]){

        // String[] str = new String[]{ "Cooler" , "Coolpad" , "Cool" };
        String[] str = new String[]{ "g","geek" , "geeks" , "geeksforgeeks" };

        System.out.println( getPrefix(str) );

        // System.out.println(result);
    }

    static String getPrefix( String str[] ){
        
        String prefix = "";

        for(int i = 0; i < str[0].length();i++){

            for(int j = 1; j < str.length;j++){
                if( str[j].length() > i )
                    if( str[0].charAt(i) == str[j].charAt(i) )
                        continue;
                    else{
                        return prefix;
                    }
                else
                    return prefix;
            }
            prefix += str[0].charAt(i);
        }

        return prefix;
    }
}
