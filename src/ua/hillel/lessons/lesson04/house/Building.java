package ua.hillel.lessons.lesson04.house;

public class Building {

	private double height;
	private double width;
	private double length;
	private int floor;
	private boolean hasParking;
	private String buildingMaterial;
	private String overlapMaterial;

	double getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}

	double getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	double getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	double getSquare() {
		return width * length;
	}

	int getFloor() {
		return floor;
	}

	void setFloor(int floor) {
		this.floor = floor;
	}

	String getBuildingMaterial() {
		return buildingMaterial;
	}

	void setBuildingMaterial(String buildingMaterial) {
		this.buildingMaterial = buildingMaterial;
	}

	String getOverlapMaterial() {
		return overlapMaterial;
	}

	void setOverlapMaterial(String overlapMaterial) {
		this.overlapMaterial = overlapMaterial;
	}

	boolean isHasParking() {
		return hasParking;
	}

	String hasParking() {
		if(isHasParking() == true){
			return "yes, there is a parking.";
		}
		else
			return "house does't have parking place.";
	}
	void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}
}
