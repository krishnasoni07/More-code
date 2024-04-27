import java.util.Scanner;

class ReverseStringWords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println( reverseWords( "Hello world how are you") );

        sc.close();
	}

	public static String reverseWords(String str) {
    if (str == null || str.isEmpty()) {
        return str; // Return the original string if it's null or empty
    }

    int s = 0; // Start index for a word
    int e = 0; // End index for a word
    StringBuilder reversed = new StringBuilder();

    while (e < str.length()) {
        if (str.charAt(e) == ' ') {
            // Reverse and append the word
            for (int j = e - 1; j >= s; j--) {
                reversed.append(str.charAt(j));
            }
            reversed.append(' '); // Append the space after the word
            s = e + 1; // Update the start index for the next word
        }
        e++; // Move to the next character
    }

    // Reverse and append the last word (no space after it)
    for (int j = str.length() - 1; j >= s; j--) {
        reversed.append(str.charAt(j));
    }

    return reversed.toString();
    
}

}