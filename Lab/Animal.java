package LabAssignments;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	String name;
	double weightInGrams;
	List <Animal> listOfAnimals = new ArrayList<Animal>();
	public void eat(double foodWeightInGrams)
	{
		weightInGrams=weightInGrams+foodWeightInGrams;
	}
	abstract void call();
	public void setName(String newName)
	{
		name=newName;
	}
	public String getName()
	{
		return name;
	}
	public void setWeightInGrams(double newWeightInGrams)
	{
		weightInGrams=newWeightInGrams;
	}
	public double getWeightInGrams()
	{
		return weightInGrams;
	}
	public String toString()
	{
		return super.toString();
	}
}
