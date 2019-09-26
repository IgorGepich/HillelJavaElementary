package ua.hillel.lessons.lesson04.plants.pinophyta;

/**
 * juniper - можжевельник. Куст
 */

public class Juniper extends Pinophyta {

	public Pinophyta pinophytaTreeCreator() {
		Pinophyta juniper = new Pinophyta();
		juniper.setSeedGroup("Pinophyta");
		juniper.setPinophytaGroup("bush");
		juniper.setTreeName("Juniper");
		juniper.setConus(false);
		juniper.setTreeHeight(2);
		return juniper;
	}

	public void printTree(){
		System.out.println(pinophytaTreeCreator().toString());

	}
}
