package Strings;

public class Anagram_of_String {
    public static void main(String args[]){

        String s1 = "basgadhbfgvhads";
        String s2 = "sjdhgvbjdsbhvbvd";

        int arr[] = new int[26];
        int sum = 0;

        for(int i = 0; i < s1.length();i++) arr[ (int)( s1.charAt(i) - 97 ) ]++;

        for(int i = 0; i < s2.length();i++)
            arr[ (int)( s2.charAt(i) - 97 ) ]--;

        for(int i = 0; i < arr.length;i++)
            sum += arr[i];
        System.out.println(sum);
    }

    public static int mainn(String args[]){
        System.out.println("Hellp world");

        return 0;
    }
}
