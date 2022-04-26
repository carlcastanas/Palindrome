//Write a java program that will determine whether an input string is palindrome or not. A palindrome is a type of word play in which a word or phrase spelled forward is the same word or phrase spelled backward.
//You will use Stack ADT (Advance Data Structure). Use of other ADTS or predefined methods to test palindrome will give you a zero score. You must create and use your own algorithm.
//Example of palindrome:
//1. radar
//2. civic
//3. racecar
//4. kayak

import java.util.LinkedList; //importing linked list
import java.util.Queue; //importing queue
import java.util.Stack; //importing stack ADT
import java.util.Scanner; //importing scanner

public class Palindrome 
{
   public static void main(String[ ] args) // main method
   { 
	Scanner input = new Scanner(System.in); //creating scanner
	String inputString; //declaring input string
      	System.out.print("Enter Your input string: "); //prompting user to enter input string
        inputString = input.next( ); //accepting input string

	if (isPalindrome( inputString )){ //calling isPalindrome method
		System.out.println("That is a palindrome."); //printing that it is a palindrome
	}
	else{
		System.out.println("That is not a palindrome."); //printing that it is not a palindrome
      	}
   }

   public static boolean isPalindrome(String input)  //method to determine if input string is palindrome
   {   
      Queue<Character> q = new LinkedList<Character>( ); //creating queue
      Stack<Character> s = new Stack<Character>( ); //creating stack
      char letter; //declaring letter
      int i; //declaring i
      
      for (i = 0; i < input.length( ); i++) //for loop to add each letter of input string to queue
      {
	 letter = input.charAt(i); //assigning letter to each letter of input string
         q.add(letter); //adding letter to queue
         s.push(letter); //adding letter to stack
      }    
      while (!q.isEmpty( )) //while loop to remove each letter of input string from queue
      {
         if (q.remove( ) != s.pop( )) //if statement to remove each letter of input string from queue and stack
           return false; //returning false if letter does not match
      }
      return true; //returning true if letter matches
   }
    
}
