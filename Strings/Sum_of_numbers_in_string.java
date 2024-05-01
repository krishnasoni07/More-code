package Strings;

public class Sum_of_numbers_in_string {
    public static void main(String[] args) {
        
        String str = "geeks4geeks";
        String num = "0";
        int sum = 0;

        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);

            if( ch >= '0' && ch <= '9') num += ch;
            else{

                sum += Integer.parseInt(num);
                num = "0";
            }
            
            if( i == str.length() - 1 ){
                sum += Integer.parseInt(num);
            }

        }
        System.out.println(sum);

    }
}
