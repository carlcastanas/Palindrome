//Write a java program that will determine whether an input string is palindrome or not. A palindrome is a type of word play in which a word or phrase spelled forward is the same word or phrase spelled backward.
//You will use Stack ADT (Advance Data Structure). Use of other ADTS or predefined methods to test palindrome will give you a zero score. You must create and use your own algorithm.
//Example of palindrome:
//1. radar
//2. civic
//3. racecar
//4. kayak

import java.util.Stack;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {                
        Stack <Character> stck3 = 
        new Stack<Character>();
        Scanner input = 
        new Scanner(System.in);
        String res = "";        
        System.out.println("Please enter a String: ");
        String inp = input.next();
        for (int i = 0; i < inp.length(); i++)             
        stck3.push(inp.charAt(i)); while(!stck3.empty())
        res += stck3.pop();
        if(inp.equals(res))
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");        
    }
}
