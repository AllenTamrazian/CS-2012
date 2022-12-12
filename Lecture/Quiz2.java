package Quiz2;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args)
	{
		//create scanner
		Scanner sc = new Scanner(System.in);
		//prompt
		System.out.print("Please input a String to reverse ");
		//get input
		String input=sc.next();
		//change word to array
		char[] wordChars=input.toCharArray();
		//create stringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		//variable to keep track of characters that are not numbers
		int characters=0;
		//while at least one character is a number
		while(characters<input.length()-1)
		{
			//go through every character
			for(int i=0;i<=input.length()-1;i++)
			{
				//check if the character is a number
				if(wordChars[i]>='0' && wordChars[i]<='9')
				{
					//ask for new input
					System.out.print("Sorry, this is a wrong input, please enter a String");
					input=sc.next();
					characters=0;
					wordChars=input.toCharArray();
				}
				else
				{
					//if there are no numeric characters
					characters++;
				}
			}
		}
		//add string to stringBuilder
		stringBuilder.append(input);
		//reverse the string
		System.out.print("String reversed: "+stringBuilder.reverse());

	}

}
