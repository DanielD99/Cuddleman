package Task2;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Room [] rooms = new Room[3];
		rooms[0] = new Room(4, 1, 2,1);
		rooms[1] = new Room(5, 2, 2,3);
		rooms[2] = new Room(4, 1, 1,1);

		Building building = new Building(rooms, 1, 4, false);

		System.out.println("There are " + building.getLampsInBuilding() + " lamps in the building");

		if(building.getNumberOfFloors() > building.getRooms().length) {
			System.out.println("This building is odd");
		}
	}

	@Override
	public void start(Stage primaryStage) {

	}
}
