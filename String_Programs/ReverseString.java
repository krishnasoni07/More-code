import java.util.Scanner;

class ReverseString{
	static public void main(String ...args){
		Scanner sc = new Scanner(System.in);

		System.out.println( reverseString( sc.nextLine() ) );

		sc.close();
	}

	public static String reverseString( String str ){
		String rstr = "";

		for(int i = str.length() - 1;i >= 0;i--)
			rstr += str.charAt( i );

		return rstr;
	}


}