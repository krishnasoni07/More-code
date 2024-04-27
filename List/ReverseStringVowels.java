package List;

public class ReverseStringVowels{
    static int stringLength;
    public static void main(String args[]){
        String str = "you can do it";
        stringLength = str.length() - 1;

        printString(str);
    }

    static void printString(String str){

        for(int i = 0; i < str.length();i++){

            if( isVowel(str.charAt(i)) ){
                System.out.print( getLastVowel(str) );
                continue;
            }
            System.out.print(str.charAt(i));

        }

    }

    static char getLastVowel(String str){

        while (!isVowel(str.charAt(stringLength)) && stringLength >= 0) 
            stringLength--;
        

        return str.charAt(stringLength--);
    }

    static boolean isVowel(char ch){
        return ( ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u')? true:false;
    }
}