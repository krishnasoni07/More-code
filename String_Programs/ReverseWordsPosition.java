import java.util.Scanner;

public class ReverseWordsPosition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println( reverseWordsPosition( sc.nextLine() ) );
		sc.close();
	}

	static String reverseWordsPosition( String str ){
		String rstr = reverseString( str );
		
		return reverseWords( rstr );
	}

	public static String reverseWords( String str ){
		int s , e;
		s = e = 0;
		String rstr = "";

		for( ; e < str.length();e++){
			if( str.charAt(e) == ' ' || e == str.length() - 1 ){
				for( int j = e; j >= s; j--){
					if( s == 0 && j == e)
						continue;
					rstr += str.charAt(j);
				}
				s = e;
			}
		}

		return rstr;
	}
	public static String reverseString( String str ){
		String rstr = "";

		for(int i = str.length() - 1;i >= 0;i--)
			rstr += str.charAt( i );

		return rstr;
	}
}