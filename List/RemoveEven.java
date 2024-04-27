package List;

import java.util.ArrayList;
import java.util.Scanner;


public class RemoveEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array list : ");
        Byte size = sc.nextByte();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements : ");
        for(int i = 0; i < size;i++){
            arr.add(sc.nextInt());
        }

        for(int i = size - 1; i >= 0;i--){
            if( arr.get(i) % 2 == 0) arr.remove(i);
        }

        for(int i = 0; i < arr.size();i++)
            System.out.println(arr.get(i));

        sc.close();

    }    
}
