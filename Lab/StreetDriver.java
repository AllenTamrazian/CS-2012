package Checkpoint2;

import java.util.Arrays;

public class StreetDriver {
	public static void main(String[] args)
	{
		
		Street newStreet=new Street();
		newStreet.setStreetName("Middleton");
		newStreet.getStreetName();
		newStreet.morningStroll();
		House newHouse=new House();
		newHouse.setHaunted();
		newHouse.setBuildingSize(205);
		newHouse.explore();
		newStreet.addHouseToList(newHouse);
		House newHouse1=new House();
		newHouse1.setHaunted();
		newHouse1.setBuildingSize(2111);
		newStreet.addHouseToList(newHouse1);
		newHouse1.explore();
		House newHouse2=new House();
		newHouse2.setBuildingSize(224);
		newStreet.addHouseToList(newHouse2);
		newHouse2.explore();
		House newHouse3=new House();
		newHouse3.setBuildingSize(236);
		newStreet.addHouseToList(newHouse3);
		newHouse3.explore();
		House newHouse4=new House();
		newHouse4.setBuildingSize(2121);
		newStreet.addHouseToList(newHouse4);
		newHouse4.explore();
		Asylum newAsylum=new Asylum();
		newAsylum.setHaunted();
		newAsylum.setBuildingSize(30);
		newStreet.addAsylumToList(newAsylum);
		newAsylum.explore();
		
		
		
		
	}

}
