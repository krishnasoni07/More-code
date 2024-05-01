package Strings;

public class Maximum_Occuring_Char {
    public static void main(String args[]){
        String str = "ddddeeeaaabdddddaaaaaaaaabbzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzccc";

        char ch = 'A';
        int maxNum = Integer.MIN_VALUE;

        int arr[] = new int[26];

        for(int i = 0; i < str.length();i++){

            arr[ (int)( str.charAt(i) - 97 ) ]++;
        }


        for(int i = 0; i < arr.length;i++){
            char tempch = (char)(97 + i);

            if( arr[i] > maxNum ){
                maxNum = arr[i];
                ch = (char)(97 + i);
            }
            else if( maxNum == arr[i] && ch > tempch )
                ch = tempch;

        }

        System.out.println( maxNum + " " + ch );

    }
}
