package ua.hillel.lessons.lesson04.house;

public class ResidentialBuilding extends Building {

	private boolean hasApartment;

	boolean isHasApartment() {
		return hasApartment;
	}

	void setHasApartment(boolean hasApartment) {
		this.hasApartment = hasApartment;
	}

	@Override
	public String toString(){
		return "";
	}
}
