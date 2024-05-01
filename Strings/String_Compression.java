package Strings;

public class String_Compression {
    public static void main(String args[]){

        String str = "abbbcbbdeee";
        String result = "";

        int cnt = 0;
        char ch = str.charAt(0);

        for(int i = 1; i < str.length();i++){

            if( str.charAt(i) == ch ) cnt++;
            else{
                if( cnt <= 0 ) result += ch;
                else{
                    cnt++;
                    result += ch;
                    result += cnt;
                }
                cnt = 0;
                ch = str.charAt(i);
            }
        }
        if( cnt >= 1 ){
            result += ch;
            result += ++cnt;
        }
        else
            result += ch;

        System.out.println(result);

    }
}
