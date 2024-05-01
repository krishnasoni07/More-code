package BitManipulation;

public class Set_Ith_Bit {
    
    public static void main(String args[]){
        int num = 10;
        int bit = 1 << 2;
        // bit = bit << 2;

        num = num | bit;

        System.out.println(num);
    }

}
