import java.util.Scanner;
//import java.util.Arrays;
public class Palindrome 
{ // main method begins execution
	public static void main(String[] args) 
	{ // main method begins execution
		Scanner console = new Scanner(System.in); // create Scanner object
		String input; // declare input
		
		System.out.println("Palindrome"); // print out the title
		System.out.println(); // print out a blank line
		System.out.print("Enter a string, or q to quit: "); // prompt user for input
		input = console.nextLine(); // read input
		while (!input.equals("q")) { // while input is not q
			if (isPalindrome(input)) // if input is a palindrome
				System.out.println(input + " is a palindrome."); // print out that it is a palindrome
			else // otherwise
				System.out.println(input + " is NOT a palindrome."); // print out that it is not a palindrome
			
			System.out.println(); // print out a blank line
			System.out.print("Enter a string, or q to quit: "); // prompt user for input
			input = console.nextLine(); // read input
		}
	}
	public static boolean isPalindrome(String s) // method to determine if a string is a palindrome
	{
		s.toLowerCase(); // convert to lower case
		if (s.length() < 2) // if the string is less than 2 characters
			return true; // return true
		if (s.charAt(0) == s.charAt(s.length() - 1)) // if the first and last characters are the same
		{
			s = s.substring(1, s.length() - 1); // remove the first and last characters
			if (isPalindrome(s)) // if the string is a palindrome
				return true; // return true
			else // otherwise
				return false; // otherwise return false
		}                                           
		else // otherwise
			return false; // return false
	}
}
