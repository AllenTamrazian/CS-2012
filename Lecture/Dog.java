package Exercise4;

public abstract class Dog{
	String name="";
	double weightInKg;
	public Dog(String name, double weightInKg)
	{
		this.name=name;
		this.weightInKg=weightInKg;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setWeightInKg(double weightInKg)
	{
		this.weightInKg=weightInKg;
	}
	public double getWeightInKg()
	{
		return weightInKg;
	}
	public String bark() {
		return "woof";
	}
	public String toString(String convertToString)
	{
		return convertToString;
	}

}