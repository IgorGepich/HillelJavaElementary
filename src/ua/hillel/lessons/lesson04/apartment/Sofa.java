package ua.hillel.lessons.lesson04.apartment;

public class Sofa extends Furniture{
	public static Sofa sofa = new Sofa();

	public void furnitureCreate(){
		setFurnitureType("sofa");
		setFurnitureMaterial("wood");
		setMattress(true);
		setHeight(40);
		setLength(2000);
		setWidth(1800);
	}

	public Sofa sofaCreate(){
		sofa.setFurnitureType("Sofa");
		sofa.setLength(1200);
		sofa.setHeight(1000);
		sofa.setWidth(2000);
		setMattress(true);
		return sofa;
	}
}
