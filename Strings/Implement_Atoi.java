package Strings;

public class Implement_Atoi {
    public static void main(String[] args) {
        
        String str = "1000";
        int number = 0;

        for (int i = 0; i < str.length(); i++)
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(0) == '-')
                continue;
            else
                return ;

        if (str.charAt(0) == '-')
            for (int i = 1; i < str.length(); i++) {
                int rem = (int) str.charAt(i) - 48;
                number = number * 10 + rem;
            }

        else
            for (int i = 0; i < str.length(); i++) {
                int rem = (int) str.charAt(i) - 48;
                number = number * 10 + rem;
            }

        System.out.println(~number + 1);

    }
}
