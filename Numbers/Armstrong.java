package Numbers;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check it is Armstrong or not : ");
        int num = sc.nextInt();
        int temp = num;
        int cnt = 0;

        while( temp > 0 ){
            cnt++;
            temp/=10;
        }
        temp = num;
        int sum = 0;

        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            int pow = 1;

            for(int i = 1; i <= cnt;i++)
                pow *= rem;

            sum += pow;
        }

        System.out.println( (sum == num)? "Armstrong ":"Not Armstrong" );

        sc.close();

    }
}
