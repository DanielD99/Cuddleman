package Task3;

public class Monkey extends Animal {

	public Monkey(int numberOfLegs) {
		super(numberOfLegs);
	}

	@Override
	public void makeSound() {
		System.out.println("ook, hoo hoo hoo hoo");
	}
}
