package Arrays;

import java.util.ArrayList;

public class Reverse_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        reverseList(arr);

        System.out.println(arr);
    }

    public static ArrayList<Integer> reverseList( ArrayList<Integer> arr ){

        for(int i = 0 , j = arr.size() - 1; i < arr.size() / 2 + 1; i++ , j--){
            int temp = arr.get(i);
            arr.set( i , arr.get(j) );
            arr.set( j , temp );
        }

        return arr;
    }
}
