package JavaPractice;

import javax.swing.JOptionPane;

public class IntegerToBinary {
    public static void main(String args[]){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));

        System.out.println(IntToBin(num));

    }

    static StringBuilder IntToBin(int num){
        StringBuilder binary = new StringBuilder("");

        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        binary.append((num == 1)?"1":"");
        return binary.reverse();
    }
}
