package LabAssignments;

public class Bird extends Prey{
	String name;
	double weightInGrams;
	public Bird(double weightInGrams, String name) {
		this.name=name;
		this.weightInGrams=weightInGrams;
	}
	@Override
	void flee() {
		System.out.println(name+" flies away.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
