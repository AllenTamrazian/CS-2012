package Exercise1;
import java.io.*;

public class Exercise1 {
	public static void main(String[] args)
	{
		//an error might occur
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/Users/allentamrazian/Desktop/WordFile.txt"));
			String sentence;
			sentence=br.readLine();
			//make the sentence lowercase to compare letters
			sentence=sentence.toLowerCase();
			//make a StringBuffer
			StringBuffer sb = new StringBuffer(sentence);
			//get the length of the sentence
	        int sentenceLength = sb.length();
	        //make counter for counting amount of uniqueLetters
	        int differentChars = 0;
	        //for loop to compare 
	        for (int i = 0; i < sentenceLength; i++) {
	        	differentChars = 0;
	        	//for loop to compare characters next to each other
	            for (int j = i + 1; j < sentenceLength; j++) {
	            	//if there is a character that appears more than once
	                if (sb.charAt(i) == sb.charAt(j)) {
	                	//delete one of the similar characters
	                    sb.deleteCharAt(j);
	                    differentChars++;
	                    j--;
	                    //the length is 1 less after removing a character
	                    sentenceLength--;
	                }
	            }
	            //when there is a different character checked, remove it
	            if (differentChars > 0) {
	                sb.deleteCharAt(i);
	                i--;
	                sentenceLength--;
	            }
	        }
	        //if the length of the string is 0
	        if (sb.length() == 0) {	
	            System.out.println(-1);
	        } else System.out.println(sb.length());
		}
		catch(Exception ex)
		{
			System.out.println("An error occured.")
;		}
		
	}
}
