//This program is a program that gets 10 words from the user and first converts them to lowercase with one
//method and after that, it uses a different method to convert the words to uppercase

package LabAssignment1;

import java.util.Scanner;	//import scanner

public class LabAssignmentOne {
	public static void lowerCaser()		//method for making 10 words lowercase
	{
		Scanner sc = new Scanner(System.in);	//new scanner
		for(int i=0;i<10;i++)			//repeat for 10 words
		{
			String userInput="";		//initialize empty string for userInput
			int differenceBetweenLowerAndUpperCaseChar = 'a'-'A';//difference between lowercase and uppercase
			System.out.print("Type a word you want to make lowercase.");
			System.out.println();			//formatting
			userInput=sc.next();			//get user inputted word
			char[] inputChars=userInput.toCharArray();	//convert word to array
			
			for(int k=0;k<userInput.length();k++)	//go through every letter in word
			{
				if(inputChars[k]>='A' && inputChars[k]<='Z')	//if the letter is uppercase
				{
					inputChars[k]+=differenceBetweenLowerAndUpperCaseChar;	//make it lowercase by adding 
																			//dif between 'A' and 'a'
					
				}
				
			}
			System.out.print("lowercase:");
			System.out.println(inputChars);
		}
	}
	public static void upperCaser()		//method for making 10 words uppercase
	{
		Scanner sc = new Scanner(System.in);	//new scanner
		for(int i=0;i<10;i++)			//repeat for 10 words
		{
			String userInput="";		//initialize empty string for userInput
			int differenceBetweenLowerAndUpperCaseChar = 'a'-'A';//difference between lowercase and uppercase
			System.out.print("Type a word you want to make uppercase.");
			System.out.println();			//formatting
			userInput=sc.next();			//get user inputted word
			char[] inputChars=userInput.toCharArray();	//convert word to array
			
			for(int k=0;k<userInput.length();k++)	//go through every letter in word
			{
				if(inputChars[k]>='a' && inputChars[k]<='z')	//if the letter is lowercase
				{
					inputChars[k]-=differenceBetweenLowerAndUpperCaseChar;	//make it lowercase by 
																			//subtracting dif between
																			//'A' and 'a'
				}
				
			}
			System.out.print("uppercase:");
			System.out.println(inputChars);
		}
	}
	public static void main(String[] args)	//main method with lowerCaser() and upperCaser() methods
	{
		lowerCaser();
		upperCaser();
		}

}
