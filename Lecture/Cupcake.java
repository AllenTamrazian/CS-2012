package Exercise2;

public class Cupcake extends Portion{
	//variables for cupcake
	double cupcakeRadius;
	double cupcakeHeight;
	double cupcakeVolume;
	//get radius and height argument for cupcake
	public Cupcake(double cupcakeRadius, double cupcakeHeight)
	{
		this.cupcakeRadius=cupcakeRadius;
		this.cupcakeHeight=cupcakeHeight;
		//get the cupcake volume
		cupcakeVolume=Math.PI*cupcakeRadius*cupcakeRadius*cupcakeHeight;
		//update calories consumed
		caloriesPerServing=4*cupcakeVolume;
	}

}
