package ua.hillel.lessons.lesson04.plants.angiosperms;

public class Grass extends Angiosperms {

	public Angiosperms angiospermsCreator(){
	Angiosperms grass = new Angiosperms();
	grass.setSeedGroup("Magnoliophyta");
	grass.setAngiospermsGroup("Blooming");
	grass.setPlantName("Lawn Grass");
	setPeriodOfLife("perennial");
	grass.setPeriodOfLife("perennial");
	return grass;
	}

	public void printPlant(){
		System.out.println(angiospermsCreator().toString());
	}
}