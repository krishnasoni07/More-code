package Strings;

public class Uncommon_Characters {
    public static void main(String args[]){

        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        String toReturn = "";

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i = 0; i < s1.length();i++)
            arr1[ (int)( s1.charAt(i) - 97 ) ]++;
        
        for(int i = 0; i < s2.length();i++)
            arr2[ (int)(s2.charAt(i) - 97) ]++;


        for(int i = 0;i < arr1.length;i++){

            if( arr1[i] == 0 || arr2[i] == 0 )
                toReturn += (char)(97 + i);

        }

        System.out.println(toReturn);
    }
}
