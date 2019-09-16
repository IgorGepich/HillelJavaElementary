package ua.hillel.lessons.lesson04.apartment;

public class Apartment {
	private double height;
	private double width;
	private double length;
	private boolean sewerage;
	private String nameOfPremise;

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public boolean isSewerage() {
		return sewerage;
	}

	public void setSewerage(boolean sewerage) {
		this.sewerage = sewerage;
	}

	public void setSquare(double height, double width, double length){
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public void setNewApartment(String nameOfPremise, double height, double width, double length, boolean sewerage){
		this.nameOfPremise = nameOfPremise;
		this.height = height;
		this.width = width;
		this.length = length;
		this.sewerage = sewerage;
	}

	public double getSquare(){
		return width * length;
	}

	public String getNameOfPremise() {
		return nameOfPremise;
	}

	public void setNameOfPremise(String nameOfPremise) {
		this.nameOfPremise = nameOfPremise;
	}

	public String toString(){
		return "Apartment square: " + getSquare() + " meters.";
	}
}
