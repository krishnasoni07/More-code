package Z;

public class Methods {
    
    public static int reverse(int num){
        int rev = 0;

        while( num > 0 ){
            int rem = num % 10;
            num /=10;
            rev = rev * 10 + rem;
        }

        return rev;
    }

    public static void reverse(int []arr){

        for(int i = 0, j = arr.length - 1; i < arr.length / 2;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    public static int getFactorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;

        return fact;
    }

}
