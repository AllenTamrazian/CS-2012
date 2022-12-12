package LabAssignments;

public abstract class Predator extends Animal{
	void predate(Prey somePrey) {
		eat(somePrey.weightInGrams);
		//this does not work for some reason. If you have an explanation, I would like to know
		//because I'm really curious
		System.out.println(super.name+" ate "+somePrey.name);
	}
}