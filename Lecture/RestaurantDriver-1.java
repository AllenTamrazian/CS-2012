package Exercise2;

import java.util.Scanner;

public class RestaurantDriver {
	public static void main(String[] args)
	{
		//if the input is bad
		try
		{
			//make new customer
			Customer nc = new Customer();
			//keep track of cupcakes and pancakes eaten
			int cupcakesEaten=0;
			int pancakesEaten=0;
			//loop where customer orders until they explode
			while(nc.totalCaloriesEaten<10000)
			{
				Scanner sc = new Scanner(System.in);
				//get customer's order
				System.out.println("What would you like to order? Say 'cupcake' or 'pancake'");
				//get the order
				String order=sc.next();
				//variables for pancake radius + cupcake radius and height
				double radius;
				double height;
				//if the customer inputs their order for cupcake
				if(order.equalsIgnoreCase("Cupcake"))
				{
					//get the radius and height of the cupcake
					System.out.println("What is the radius of the cupcake?");
					radius=sc.nextDouble();
					System.out.println("What is the height of the cupcake?");
					height=sc.nextDouble();
					//create new cupcake
					Cupcake cp = new Cupcake(radius, height);
					//customer eats cupcake
					nc.eat(cp);
					System.out.println("Customer eats a cupcake with volume "+cp.cupcakeVolume+" and "+cp.caloriesPerServing+" calories");
					cupcakesEaten++;
				}
				if(order.equalsIgnoreCase("Pancake"))
				{
					//get the radius of the pancake
					System.out.println("What is the radius of the pancake?");
					radius=sc.nextDouble();
					//create new pancake
					Pancake pc = new Pancake(radius);
					//customer eats pancake
					nc.eat(pc);
					System.out.println("Customer eats a cupcake with volume "+pc.pancakeArea+" and "+pc.caloriesPerServing+" calories");
					pancakesEaten++;
				}
			}
			//when the customer explodes
			System.out.println("The customer has exploded");
			System.out.println("The customer ate "+cupcakesEaten+" cupcakes and "+pancakesEaten+" pancakes.");
		}
		//if input is wrong
		catch(Exception ex)
		{
			System.out.print("That is not the right input.");
		}
		
		
	}
}
