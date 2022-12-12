package LabAssignments;

public class Mouse extends Prey{
	String name;
	double weightInGrams;
	public Mouse(double weightInGrams, String name) {
		this.name=name;
		this.weightInGrams=weightInGrams;
	}

	@Override
	void flee() {
		System.out.println(name+" scurries away.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
