package ua.hillel.lessons.lesson04.apartment;

public class Kitchen extends Apartment {

	Window kitchenWindow = new Window();

	Furniture kitchenTable = new Furniture();

		public Kitchen kitchenCreate() {
			Kitchen kitchen = new Kitchen();
			kitchen.setNewApartment("Kitchen", 3, 3, 4, true);
			kitchenWindow.setWindow(120, 100, "Wood");
			kitchenTable.createFurniture("Table", "Wood", 120, 100, 100);
			return kitchen;
		}

		public void printKitchenInfo() {
			System.out.println("Name of the room: " + kitchenCreate().getNameOfPremise() + "\nSquare of the room: " + kitchenCreate().getSquare()
					+ "\nCeiling height: " + kitchenCreate().getHeight());
			System.out.println("Window in kitchen: " + kitchenWindow.toString());
			System.out.println("Furniture in the kitchen: " + kitchenTable.toString());
		}
}
