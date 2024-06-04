package JavaPractice;

public class FindUnique {
    public static void main(String args[]){
        int arr[] = new int[] {1,2,1,3,5,1,4,6,6,4,2,5,1};

        int unique = 0;

        for(int i = 0; i < arr.length;i++)
            unique = arr[i] ^ unique;

        System.out.println(unique);
    }
}
