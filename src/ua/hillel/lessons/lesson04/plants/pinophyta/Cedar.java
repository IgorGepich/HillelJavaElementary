package ua.hillel.lessons.lesson04.plants.pinophyta;

public class Cedar extends Pinophyta {

	public Pinophyta pinophytaTreeCreate(){
		Pinophyta cedar = new Pinophyta();
		cedar.setSeedGroup("Pinophyta");
		cedar.setPinophytaGroup("tree");
		cedar.setTreeName("Cedar");
		cedar.setConus(true);
		cedar.setTreeHeight(30);
		return cedar;
	}

	public void printTree(){
		System.out.println(pinophytaTreeCreate().toString());
	}
}
