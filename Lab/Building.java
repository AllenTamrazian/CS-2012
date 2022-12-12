package Checkpoint2;

public abstract class Building {
	double buildingSize;
	boolean haunted;
	public void explore()
	{
		if(haunted==true)
		{
			System.out.println("This building is haunted");
		}
		else
		{
			System.out.println("This building is not haunted");
		}
	}
	

}
