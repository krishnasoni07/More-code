import java.util.Scanner;

public class UToL_LTOUCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str = new String( sc.nextLine() );
		String rstr = "";

		rstr = convert( str );

		System.out.println(rstr);
	}


	static String convert( String str ){
		String rstr = "";

		for(int i = 0; i < str.length();i++){
			char ch = str.charAt(i);
			if( ch >= 'A' && ch <= 'Z' && ch != ' ')
				rstr += (char)( ch + 32 );
			else if( ch >= 'a' && ch <= 'z' && ch != ' ')
				rstr += (char)( ch - 32 );
			else
				rstr += ch;
		}

		return rstr;
	}
}