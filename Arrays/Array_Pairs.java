package Arrays;
import java.util.ArrayList;

public class Array_Pairs {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        System.out.println( getPairsCount(arr) );
    }   
    
    public static int getPairsCount( ArrayList<Integer> arr ){

        int count = 0;

        for(int i = 0; i < arr.size();i++){

            for(int j = i + 1; j < arr.size();j++){
                System.out.print( "[ " + arr.get(i) + " , " + arr.get(j) + "]"  );
                count++;
            }
            System.out.println();

        }

        return count;
    }
}
