package Exercises;

public class Address implements Cloneable {

private int streetNumber;
private String streetName;
private String city;
private String state;

public Address(int streetNumber, String streetName, String city,String state) 
{
super();
this.streetNumber = streetNumber;
this.streetName = streetName;
this.city = city;
this.state = state;
}
@Override
public Address clone() 
{
	try
	{
		Address a=(Address)super.clone();
		a.streetNumber=streetNumber;
		a.streetName=streetName;
		a.city=city;
		a.state=state;
		return a;
	}
	catch(Exception ex)
	{
		System.out.print("Something went wrong here");
		return null;
	}
}

@Override
public boolean equals(Object other) 
{
	return (this == other);
}
public String toString() 
{
return streetNumber + " " + streetName + " " + city + ", " + state;
}
}