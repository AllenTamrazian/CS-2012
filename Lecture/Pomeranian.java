package Exercise4;

public class Pomeranian extends Dog{

	public Pomeranian(String name, double weightInKg) {
		super(name, weightInKg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return "yap yap yap";
	}
	public void huntGopher()
	{
		System.out.println(name+" digs into gopher burrow in single minded quest of prey.");
	}
	}