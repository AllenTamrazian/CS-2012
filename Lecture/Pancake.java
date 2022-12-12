package Exercise2;

public class Pancake extends Portion{
	//variables for pancake
	double pancakeRadius;
	double pancakeArea;
	public Pancake(double pancakeRadius)
	{
		this.pancakeRadius=pancakeRadius;
		//get the pancake area
		pancakeArea=Math.PI*pancakeRadius*pancakeRadius;
		//update calories consumed
		caloriesPerServing=pancakeArea*10;
	}

}
