package Task2;

public class Building {
	private final Room rooms[];
	private int numberOfBathrooms, numberOfFloors;
	private boolean isOfficeBuilding;

	public Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
		this.rooms = rooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfFloors = numberOfFloors;
		this.isOfficeBuilding = isOfficeBuilding;
	}

	public int getLampsInBuilding() {
		int lamps = 0;
		for (Room room: rooms) {
			lamps += room.getNumberOfLamps();
		}
		return lamps;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isOfficeBuilding() {
		return isOfficeBuilding;
	}
}
