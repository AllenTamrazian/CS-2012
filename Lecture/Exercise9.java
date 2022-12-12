package Exercises;

import java.util.Scanner;

public class Exercise9{
    public static void main(String args[]){
    	try
		{
    		System.out.println("Enter a nonnegative integer: ");
    		int fibonacchiNumberInput;
            Scanner sc= new Scanner(System.in);
            fibonacchiNumberInput=sc.nextInt();
            sc.close();
            //make sure that input is nonnegative integer
            if(fibonacchiNumberInput>0 || fibonacchiNumberInput==0)
			{
				//end message
				System.out.println("The fibonacchi number for " + fibonacchiNumberInput + " is " + fibonacci(fibonacchiNumberInput));
			}
			//if input is nonnegative integer
			else
			{
				//if the input is nonnegative
				System.out.println("That is not a nonnegative integer!");
			}
		}
    	//if there is an exception
        catch(Exception ex)
    	{
        	System.out.println("That is not a nonnegative integer!");
    	}
    }
    public static int fibonacci(int n){
    	//if the input is 0
        if(n==0){
            return 0;
        }
        //if the input is 1
        else if(n==1){
            return 1;
        }
        //every other input
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}