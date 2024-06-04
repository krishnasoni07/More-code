package JavaPractice;

public class SwapTwoNumbers {
    static public void main(String args[]){
        int num = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();

        num = num ^ num2;
        num2 = num ^ num2;
        num = num ^ num2;

        System.out.println(num + " " + num2);
    }
}
