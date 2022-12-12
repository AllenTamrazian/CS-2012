package Exercise4;

public class PitBull extends Dog{
	double mouthCapacityInGrams;

	public PitBull(String name, double weightInKg, double mouthCapacityInGrams) {
		super(name, weightInKg);
		// TODO Auto-generated constructor stub
		this.name=name;
		this.weightInKg=weightInKg;
		this.mouthCapacityInGrams=mouthCapacityInGrams;
	}
	public void setMouthCapacityInGrams(double mouthCapacityInGrams) {
		this.mouthCapacityInGrams=mouthCapacityInGrams;
	}
	public double getMouthCapacityInGrams()
	{
		return mouthCapacityInGrams;
	}
	public void attack()
	{
		System.out.println(name+" rips its victim to shreds with its vicious jaws.");
		weightInKg=weightInKg+mouthCapacityInGrams/1000;
		System.out.println("The weight of "+name+" now is "+weightInKg+".");
	}
	public String toString(String convertToString)
	{
		return convertToString;
	}

}
