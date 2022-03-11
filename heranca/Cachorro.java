package heranca;

public class Cachorro extends Animal {
	
	public void Corra() {
		System.out.println("Correndo...");
	}

	@Override
	public void Som() {
			System.out.println("Latindo...");
	}
}
