package Checkpoint2;

public class Asylum extends Building{
	public Asylum() {}
	String asylumName="Happy Little Asylum";
	int numOfHauntedBuildings=0;
	public double setBuildingSize(double buildingSize)
	{
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
		System.out.println(asylumName);
		if(haunted==true)
		{
			System.out.println("Watch out for the headless ghosts!");
		}
	}
}
