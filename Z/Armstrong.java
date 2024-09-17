package Z;

public class Armstrong {
    public static void main(String args[]){

        int num = 163;

        int count = 0;

        int temp = num;
        int ans = 0;

        while (temp > 0) {
            temp/=10;
            count++;
        }
        temp = num;
        int pow = 1;

        while( temp > 0 ){
            int rem = temp % 10;
            temp/=10;
            pow = 1;
            for(int i = 1; i <= count;i++)
                pow *= rem;

            ans += pow;
        }

        if( ans == num ) System.out.println(true);
        else System.out.println(false);

    }
}
