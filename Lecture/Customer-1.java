package Exercise2;

public class Customer {
	//create variable for total calories eaten
	double totalCaloriesEaten=0;
	//eat method with Portion argument
	public void eat(Portion newPortion)
	{
		//if the customer eats less than 10000 calories
		if(totalCaloriesEaten<10000)
		{
			//update the total amount of calories eaten
			totalCaloriesEaten=totalCaloriesEaten+newPortion.caloriesPerServing;
			System.out.println("The customer has eaten a portion");
		}
		//if the customer explodes
		else
		{
			System.out.println("Customer ate __ cupcakes and __pancakes");
		}
	}
}
