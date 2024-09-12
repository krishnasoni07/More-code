

public class convet {
    public static void main(String args[]){

        String str = "how are you";

        String res = "";

        int end = str.length() - 1;
        for(int i = str.length() - 1; i >= 0;i--){

            if ( str.charAt(i) == ' ' || i == 0) {
                for(int j = i; j <= end;j++)
                    res += str.charAt(j);
                end = i;
            }

        }

        System.out.println(res);

    }
}
