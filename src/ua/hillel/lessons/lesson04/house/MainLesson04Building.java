package ua.hillel.lessons.lesson04.house;

public class MainLesson04Building {
	public static void main(String[] args) {

		WoodenHouse country = new WoodenHouse();
		country.countryHouseCreator();
		country.printBuilder(country);
		country.printBuildingInformation();

		IndustrialBuilding industrialBuilding = new IndustrialBuilding();
		industrialBuilding.printIndustrialBuildingInfo();
	}
}
