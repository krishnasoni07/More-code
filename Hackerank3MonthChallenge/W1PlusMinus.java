package Hackerank3MonthChallenge;



public class W1PlusMinus {
    public static void main(String[] args) {

        int arr[] = CommonMethods.takeInput();

        PlusMinus(arr);

    }

    public static void PlusMinus(int arr[]){
        float p=0,n=0,z=0;
        for(int i = 0; i < arr.length;i++)
            if( arr[i] > 0 )p++;
            else if( arr[i] < 0 )n++;
            else z++;
        System.out.printf( "%.6f\n", p / arr.length) ;
        System.out.printf( "%.6f\n", n / arr.length) ;
        System.out.printf( "%.6f\n", z / arr.length) ;
    }
}
