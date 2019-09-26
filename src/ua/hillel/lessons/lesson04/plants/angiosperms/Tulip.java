package ua.hillel.lessons.lesson04.plants.angiosperms;

public class Tulip extends Angiosperms {

	public Angiosperms angiospermsCreator(){
		Angiosperms tulip = new Angiosperms();
		tulip.setSeedGroup("Magnoliophyta");
		tulip.setAngiospermsGroup("blooming");
		tulip.setPlantName("Tulip");
		tulip.setPeriodOfLife("perennial");
		tulip.setFlowers(true);
		tulip.setRoot("bulb");
		tulip.setFruitType("does not bear fruit");
		return tulip;
	}
	public String tulipBuilder(Angiosperms tulip){
	StringBuilder tulipBuild = new StringBuilder();
		tulipBuild.append("\n");
		tulipBuild.append("Seed group: ");
		tulipBuild.append(tulip.getSeedGroup());
		tulipBuild.append("\n");
		tulipBuild.append("Angiosperms group: ");
		tulipBuild.append(tulip.getAngiospermsGroup());
		tulipBuild.append("\n");
		tulipBuild.append("Plant name: ");
		tulipBuild.append(tulip.getPlantName());
		tulipBuild.append("\n");
		tulipBuild.append("Life period: ");
		tulipBuild.append(tulip.getPeriodOfLife());
		tulipBuild.append("\n");
		tulipBuild.append("Flowers: ");
		tulipBuild.append(tulip.isFlowers());
		tulipBuild.append("\n");
		tulipBuild.append("Root type: ");
		tulipBuild.append(tulip.getRoot());
		tulipBuild.append("\n");
		tulipBuild.append("Fruit type: ");
		tulipBuild.append(tulip.getFruitType());
		tulipBuild.append("\n");
		return tulipBuild.toString();
	}
	public void printPlant(){
		System.out.println(tulipBuilder(angiospermsCreator()));
	}
}
