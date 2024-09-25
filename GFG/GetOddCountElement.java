package GFG;

public class GetOddCountElement {
    public static void main(String args[]){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter arr Size : ");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Enter Array elements :  ");
        for(int i = 0; i < arr.length;i++)
            arr[i] = sc.nextInt();
            
        System.out.println("Odd count element : " + getOddCountElement(arr) );
        
        sc.close();
    }
    
    public static int getOddCountElement(int arr[]){
        int oddCountElement = 0;
        
        for(int i = 0;i < arr.length;i++)
            oddCountElement ^= arr[i];

        return oddCountElement;
    }
}
