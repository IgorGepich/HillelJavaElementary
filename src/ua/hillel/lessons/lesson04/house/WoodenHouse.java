package ua.hillel.lessons.lesson04.house;

public class WoodenHouse extends ResidentialBuilding{
	/**
	 * @return countryHouse - object Country house with parameters.
	 */
	public ResidentialBuilding countryHouseCreator(){
		ResidentialBuilding countryHouse = new ResidentialBuilding();
		setBuildingMaterial("Wood");
		setOverlapMaterial("Wood");
		setFloor(2);
		setHeight(10);
		setWidth(10);
		setLength(15);
		setHasParking(true);
		return countryHouse;
	}

	public String printBuilder(Building countryHouse){
		StringBuilder housePrint = new StringBuilder();
			housePrint.append("\n");
			housePrint.append("House build material: ");
			housePrint.append(getBuildingMaterial());
			housePrint.append("\n");
			housePrint.append("House overlap material: ");
			housePrint.append(getOverlapMaterial());
			housePrint.append("\n");
			housePrint.append("House square: ");
			housePrint.append(getSquare());
			housePrint.append(" sq. meters.");
			housePrint.append("\n");
			housePrint.append("Number of floors: ");
			housePrint.append(getFloor());
			housePrint.append("\n");
			housePrint.append("Does the house have parking: ");
			housePrint.append(hasParking());
		return housePrint.toString();
	}
	public void printBuildingInformation(){
		System.out.println(printBuilder(countryHouseCreator()));
	}
}
