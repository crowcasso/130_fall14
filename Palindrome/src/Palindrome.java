import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String myString = sc.next();
		
		boolean ans = isPalindrome(myString);
		if (ans) {
			System.out.println(myString + " is a palindrome.");
		} else {
			System.out.println(myString + " is not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		
		return true;
	}

}
