import java.util.Scanner;

public class UpperToLowerCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str = new String(sc.nextLine());
		String rstr = "";

		for(int i = 0; i < str.length();i++){
			if( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && str.charAt(i) != ' ')
				rstr += (char) (str.charAt(i) + 32);
			else
				rstr += str.charAt(i);
		}

		System.out.println(rstr);
		sc.close();
	}
}