package LabAssignments;

public class Cat extends Predator{

	String name;
	double weightInGrams;
	public Cat(String name, double weightInGrams) {
		this.name=name;
		this.weightInGrams=weightInGrams;
	}
	@Override
	void call() {
		System.out.println(name+" says 'Meow'");
	}
}
