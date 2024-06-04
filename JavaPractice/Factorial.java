package JavaPractice;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String args[]){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));

        System.out.println(getFactorial(num));

    }

    public static int getFactorial(int num){
        int fact = 1;

        for(int i = 2; i <= num;i++)
            fact *= i;

        return fact;
    }
}
