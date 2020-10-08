package Task1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Driver driver1 = new Driver("Benjamin", 21);
		Car car1 = new Car("BMW", "M5", 2020, "Sedan");
		Car car2 = new Car("AUDI", "RS6", 2021, "Wagon");

		car1.setDriver(driver1.toString());
		car2.setDriver(driver1.toString());

		System.out.println(car1.toString() + "\n" + driver1.toString());
		System.out.println(car2.toString() + "\n" + driver1.toString());
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
