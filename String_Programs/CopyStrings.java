import java.util.Scanner;

public class CopyStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = new String(sc.nextLine());
		String cstr = "";
		for(int i = 0; i < str.length();i++)
			cstr += str.charAt(i);
		
		System.out.println(str);
		System.out.println(cstr);
		
		sc.close();
	}
}