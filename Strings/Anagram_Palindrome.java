package Strings;

public class Anagram_Palindrome {
    public static void main(String args[]){

        String str = "tkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcu";
        short arr[] = new short[26];

        for(short i = 0; i < str.length();i++){
            arr[ (int)(str.charAt(i) - 97) ]++;
        }

        for(int i = 0; i < arr.length;i++)
            System.out.println( (char)(97 + i) + " "+  arr[i]);

        byte cnt = 1;
        for(int i = 0; i < arr.length;i++)
            if( arr[i] == 1){
                if( cnt == 0 ) {
                    System.out.println("No");
                    return;
                }   
                cnt--;
            }
        System.out.println("Yes");
    }
}
