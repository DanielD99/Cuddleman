package Task3;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Monkey monkey = new Monkey(2);
		Snake snake = new Snake(0);
		Bear bear = new Bear(4);

		zoo.addAnimal(monkey);
		zoo.addAnimal(snake);
		zoo.addAnimal(bear);

		// Gætter på i mente denne method?
		zoo.makeAllSounds();

		zoo.printNumberOfLegs();
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
