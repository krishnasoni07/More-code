package Strings;
import java.util.ArrayList;

public class Reverse_Words_Position {
    

    public static void main(String args[]){

        System.out.println( reverseWords("i.like.this.program.very.much") );

    }

    static String reverseWords(String S) {

        ArrayList<String> result = new ArrayList<String>();
        String temp = "";
        
        for(int i = S.length() - 1;i >= 0; i--){

            if( S.charAt(i) == '.' ){
                result.add( temp );
            }
            else{

                temp += S.charAt(i);

            }

        }
        
        return result.toString();
    }
}


// int end = S.length()-1;
// for( int i = S.length() - 1; i >= 0;i-- ){

//     if( S.charAt(i) != '.' && i != 0) continue;
//     else{

//         int temp = (i != 0) ? i + 1 : i;
//         while( temp <= end ) result += S.charAt(temp++);
//         i--;
//         end = i;

//         if( i != 0 )
//         result += '.';
//     }

// }