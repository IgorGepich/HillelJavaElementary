package ua.hillel.lessons.lesson04.apartment;

public class Furniture {
	private double height;
	private double width;
	private double length;
	private String furnitureType;
	private String furnitureMaterial;
	private boolean mattress;

	void setHeight(double height) {
		this.height = height;
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setLength(double length) {
		this.length = length;
	}

	String getFurnitureType() {
		return furnitureType;
	}

	void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}

	String getFurnitureMaterial() {
		return furnitureMaterial;
	}

	void setFurnitureMaterial(String furnitureMaterial) {
		this.furnitureMaterial = furnitureMaterial;
	}

	public boolean isMattress() {
		return mattress;
	}

	void setMattress(boolean mattress) {
		this.mattress = mattress;
	}

	void createFurniture(String furnitureType, String furnitureMaterial, double height, double width, double length) {
		this.furnitureType = furnitureType;
		this.furnitureMaterial = furnitureMaterial;
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public String toString(){
		return "\nFurniture type: " + getFurnitureType() + "\nFurniture material: " + getFurnitureMaterial();
	}
}
