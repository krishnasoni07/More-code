// 1051. Height Checker



public class Height_Checker_1051{
    public static void main(String args[]){

        System.out.println( getCountOfTallerChilds( new int[]{ 23, 52, 46, 7, 50, 87, 20, 32, 85, 65, 62, 34, 8, 86, 15,
                66, 66, 30, 11, 96, 18, 26, 24, 10, 57, 13, 37, 69, 85, 6, 8, 17, 40, 88, 14, 72, 85, 51, 40, 38, 54,
                65, 65, 27, 18, 59, 77, 12, 25, 46, 10, 19, 10, 28, 64, 79, 5, 88, 2, 1, 14, 50, 91, 34, 58, 32, 90, 67,
                28, 81, 84, 76, 88, 45, 42, 54, 59, 56, 20, 6, 56, 51, 72, 69, 6, 48, 67, 68, 6, 10, 93, 69, 4, 29,
                28} ) );
        // System.out.println( getCountOfTallerChilds( new int[]{ 1,3,4,1} ) );
        // System.out.println( getCountOfTallerChilds( new int[]{ 5, 1, 2, 3, 4} ) );

    }

    public static int getCountOfTallerChilds( int arr[] ){

        System.out.println(arr.length);

        int rarr[] = new int[101];

        for(int i = 0; i < arr.length;i++)
            rarr[ arr[i] ]++;


        int count = 0, j = 0;

        for(int i = 1; i < rarr.length;i++){

            while( rarr[i] > 0 ){

                if( arr[j] != i ) count++;

                j++;
                rarr[i]--;
            }

        }

        return count;
    }
}