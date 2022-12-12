package Checkpoint2;

public class House extends Building{
	public House(){}
	String houseFeature="Cozy den";
	double buildingSize;
	int numOfHauntedBuildings=0;
	public double setBuildingSize(double buildingSize)
	{
		this.buildingSize=buildingSize;
		return buildingSize;
	}
	public void setHaunted()
	{
		haunted=true;
	}
	public boolean getHaunted(boolean haunted)
	{
		numOfHauntedBuildings++;
		return haunted;
	}
	
	public void explore()
	{
		System.out.println(buildingSize);
		System.out.println("You pass by a"+buildingSize+" house with a "+houseFeature);
		if(haunted=true)
		{
			System.out.println("The house is haunted!");
		}
	}
	
}
