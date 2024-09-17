package Z;

import java.lang.reflect.Method;

public class Reverse {
    public static void main(String args[]){

        System.out.println( Methods.reverse(123) );

        int arr[] = {1,2,3};
        Methods.reverse(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }


    }
}
