package Task3;

public class Animal implements AnimalSound {
	private final int numberOfLegs;

	public Animal(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void makeSound() {
		System.out.println("Undefined animal makes no sound");
	}
}
