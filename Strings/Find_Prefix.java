package Strings;

public class Find_Prefix {
    public static void main(String args[]){

        String[] str = new String[]{ "Cooler" , "Coolpad" , "Cool" };

        String test = str[0];
        String result = "";

        for(int i = 0; i < test.length();i++){

            for(int j = 1; j < str.length;j++){

                if( str[j].length() < i )
                    if( str[j].charAt(i) == str[0].charAt(i) )
                        continue;
                    else{
                        break;
                    }
                else break;
            }
            result += str[0].charAt(i);

        }

        System.out.println(result);
    }
}
