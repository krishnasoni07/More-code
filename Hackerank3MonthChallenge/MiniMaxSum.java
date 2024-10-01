package Hackerank3MonthChallenge;

public class MiniMaxSum {
    public static void main(String[] args) {

        int arr[] = CommonMethods.takeInput();

        MiniMaxSum(arr);

    }

    public static void MiniMaxSum(int arr[]){

        int min = 0,max = 0;
        int sum = 0;

        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            if( i == 0 ){
                min = arr[i];
                max = arr[i];
            }
            else{
                if( arr[i] > max) max = arr[i];
                if( arr[i] < min ) min = arr[i];
            }
        }

        System.out.println( (sum - max) + " " + (sum - min));
    }
}
