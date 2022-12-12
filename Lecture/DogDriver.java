package Exercise4;

public class DogDriver {
	public static void main(String[] args)
	{
		PitBull meanDog= new PitBull("Otis", 150, 2000);
		meanDog.setMouthCapacityInGrams(3000);
		meanDog.getMouthCapacityInGrams();
		meanDog.attack();
		meanDog.toString(meanDog.name);
		Pomeranian cuteDog=new Pomeranian("Bert", 12);
		cuteDog.setName("Maggie");
		cuteDog.getName();
		cuteDog.setWeightInKg(14);
		cuteDog.getWeightInKg();
		System.out.println(cuteDog.name+": "+cuteDog.bark());
		cuteDog.huntGopher();
		
	}

}
