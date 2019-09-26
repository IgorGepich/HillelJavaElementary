package ua.hillel.lessons.lesson04.plants;

import ua.hillel.lessons.lesson04.plants.angiosperms.Grass;
import ua.hillel.lessons.lesson04.plants.angiosperms.Tulip;
import ua.hillel.lessons.lesson04.plants.pinophyta.Cedar;
import ua.hillel.lessons.lesson04.plants.pinophyta.Juniper;

public class MainLesson04Plants {
	public static void main(String[] args) {
		Cedar cedar = new Cedar();
		cedar.pinophytaTreeCreate();
		cedar.printTree();

		Juniper juniper = new Juniper();
		juniper.pinophytaTreeCreator();
		juniper.printTree();

		Grass lawnGrass = new Grass();
		lawnGrass.angiospermsCreator();
		lawnGrass.printPlant();

		Tulip tulip = new Tulip();
		tulip.angiospermsCreator();
		tulip.tulipBuilder(tulip);
		tulip.printPlant();
	}


}
