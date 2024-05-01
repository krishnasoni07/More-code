package Strings;

public class Print_first_letter_of_every_word_in_the_string {
    public static void main(String[] args) {
        String str = "Hello World How Are you";

        for(int i = 0; i < str.length(); i++){

            if( i == 0 || (str.charAt(i) != ' ' && str.charAt(i - 1) == ' '))
                System.out.print(str.charAt(i));

        }
    }
    
    // printFirstLetter( str , 0);
    // public static void printFirstLetter(String str , int i){
    //     if( i == str.length() - 1 ) return;

    //     if( str.charAt(i - 1) == ' ' && str.charAt(i) != ' ' ) System.out.print(str.charAt(i) + " ");

    // }
}
