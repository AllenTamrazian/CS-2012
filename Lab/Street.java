package Checkpoint2;

public class Street {
	String streetName;
	//list of buildings
	Building[] buildingList=new Building[1];
	int numOfHauntedBuildings;
	public Street()
	{
		
	}
	public void setStreetName(String streetName)
	{
		this.streetName=streetName;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public void addHouseToList(House newHouse)
	{
		//copy the list
		Building[] newBuildingList=new Building[buildingList.length+1];
		for (int i = 0; i < buildingList.length; i++) 
		{
			newBuildingList[i] = buildingList[i];
		}
		//add new house at end
		newBuildingList[(newBuildingList.length)-1]=newHouse;
		buildingList=newBuildingList;
	}
	public void addAsylumToList(Asylum newAsylum)
	{
		//copy the list
		Building[] newBuildingList=new Building[buildingList.length+1];
		for (int i = 0; i < buildingList.length; i++) 
		{
			newBuildingList[i] = buildingList[i];
		}
		//add new asylum at the end
		newBuildingList[newBuildingList.length-1]=newAsylum;
		buildingList=newBuildingList;
	}
	public void getNumHaunted()
	{
		//cant figure it out
	}
	public void morningStroll()
	{
		System.out.println("Let's go for a morning stroll on "+getStreetName()+".");
	}
}
