package Exercise3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args)
	{
		//make scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times would you like to try this program?");
		//if the input is an integer
		try
		{
		//get how many times user wants to try the program
		int numberOfTimes=sc.nextInt();
		//number of times the process has been done already
		int counter=1;
		System.out.println("Please type in a word to check if it is a palindrome.");
		//get the user input
		String word = sc.next();
		//if the word is less than 10 characters
		while(word.length()<10)
		{
			System.out.println("That word is too short. Put a longer word.");
			word=sc.next();
		}
		//do for as many times as user wants for words greater than 10 characters
		while(counter<numberOfTimes && word.length()>10)
		{
			//set stringBuffer equal to word
			StringBuffer sb = new StringBuffer(word.toLowerCase());
			//reverse the word
			String reverseWord=sb.reverse().toString();
			//if it is a palindrome
			if(reverseWord.equalsIgnoreCase(word))
			{
				System.out.println("This is a palindrome.");
			}
			//if it is not a palindrome
			else
			{
				System.out.println("This is not a palindrome.");
			}
			//update number of times done
			counter++;
			word=sc.next();
		}
		}
		//if the input is not an integer
		catch(Exception ex)
		{
			System.out.println("That is not an integer.");
		}
	}

}
