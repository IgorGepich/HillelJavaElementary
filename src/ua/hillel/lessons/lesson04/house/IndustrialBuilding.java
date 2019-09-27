package ua.hillel.lessons.lesson04.house;

public class IndustrialBuilding extends Building{

	private String buildingAppointment;

	public String getBuildingAppointment() {
		return buildingAppointment;
	}

	public void setBuildingAppointment(String buildingAppointment) {
		this.buildingAppointment = buildingAppointment;
	}

	public IndustrialBuilding industrialBuildingCreator(){
		IndustrialBuilding plant = new IndustrialBuilding();
		plant.setBuildingAppointment("Plant");
		plant.setBuildingMaterial("concrete");
		plant.setOverlapMaterial("concrete");
		plant.setHeight(50);
		plant.setLength(1000);
		plant.setWidth(500);
		return plant;
	}
	public String toString(){
		return "Building appointment: " + getBuildingAppointment() + "\nConstruction material: " + getBuildingMaterial()
				+ "\nOverlap material: " + getOverlapMaterial() + "\nFactory area: " + getSquare();
	}

	public void printIndustrialBuildingInfo(){
		System.out.println(industrialBuildingCreator().toString());
	}
}
