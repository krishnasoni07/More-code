package Strings;

public class Reverse_Words_Position {
    

    public static void main(String args[]){

        System.out.println( reverseWords("dfi.like.this.program.very.much") );

    }

    static String reverseWords(String S) {
        int start = S.length() - 1;
        int end = S.length() - 1;
        String result = "";
        for (int i = S.length() - 1; i >= 0; i--) {

            if (S.charAt(i) != '.' && i != 0)
                start--;
            else {
                int j = start;
                while (j <= end)
                    result += S.charAt(j++);
                end = --start;

                if (i != 0)
                    result += '.';
                else{
                    int k = start;
                    while (k < end)
                        result += S.charAt(k++);
                }
                    

            }
        }

        return result;
    }
}
