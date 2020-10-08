package Task3;

public class Snake extends Animal {

	public Snake(int numberOfLegs) {
		super(numberOfLegs);
	}

	@Override
	public void makeSound() {
		System.out.println("Ssssssssssssss");
	}
}
