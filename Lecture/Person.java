package Exercises;

import java.util.Arrays;
import java.util.List;

public class Person implements Cloneable, Comparable <Person>{

private String name;
private Address address;

public Person(String name, Address address) 
{
super();
this.name = name;
this.address = address;
}

@Override
public Person clone() 
{
	try
	{
		Person p=(Person)super.clone();
		p.name=name;
		p.address=address;
		return p;
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

@Override
public int compareTo(Person p) 
{
	int d = name.compareTo(p.name);
	if (d == 0)
	{
		System.out.print("These are the same");
	}
	List<String> peopleNames = Arrays.asList(this.name,p.name);
	peopleNames.sort(null);
	System.out.print(peopleNames.toString());
	return d;
}

public String toString() 
{
return name + " resides at " + address;
}
}