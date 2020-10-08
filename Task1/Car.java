package Task1;

public class Car {
	private String make, model, bodyStyle, Driver;
	private int year;

	Car(String make, String model, int year, String bodyStyle) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.bodyStyle = bodyStyle;
	}

	public String getDriver() {
		return Driver;
	}

	public void setDriver(String driver) {
		Driver = driver;
	}

	@Override
	public String toString() {
		return "Make: " + make + ". Model: " + model + ". Year: " + year + ". BodyStyle: " + bodyStyle;
	}
}
