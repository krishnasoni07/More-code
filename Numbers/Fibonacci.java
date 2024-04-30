// package Numbers;

// public class Fibonacci {
//     public static void main(String[] args) {
//         java.util.Scanner sc = new java.util.Scanner(System.in);

//         System.out.print("Enter Number of terms : ");
//         int num = sc.nextInt();

//         if( num == 1 )
//             System.out.println(0);
//         else if( num == 2 )
//             System.out.println(1 + " " + 2);
//         else{
//             System.out.println( "1 2 " );
//             printFibo(num , 1 , 0 );

//         }

//         sc.close();
//     }

//     public static void printFibo( int times , int first , int second ){

//         System.out.print( first + second + " " );
//         printFibo(times - 1, second, 3);

//     }
// }
