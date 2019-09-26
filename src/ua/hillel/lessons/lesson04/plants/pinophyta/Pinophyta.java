package ua.hillel.lessons.lesson04.plants.pinophyta;

import ua.hillel.lessons.lesson04.plants.SeedPlants;

public class Pinophyta extends SeedPlants {
	/**
	 * @param pinophytaGroup tree || bush
	 */
	private String pinophytaGroup;

	private String treeName;
	private boolean conus;
	private int treeHeight;

	public String getPinophytaGroup() {
		return pinophytaGroup;
	}

	public void setPinophytaGroup(String pinophytaGroup) {
		this.pinophytaGroup = pinophytaGroup;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public boolean isConus() {
		return conus;
	}

	public void setConus(boolean conus) {
		this.conus = conus;
	}

	public int getTreeHeight() {
		return treeHeight;
	}

	public void setTreeHeight(int treeHeight) {
		this.treeHeight = treeHeight;
	}

	@Override
	public String toString(){
		return "\nSeed group: " + getSeedGroup() + "\nPinophyta group: " + getPinophytaGroup() + "\nTree name: " + getTreeName()
				+ "\nPropagated by cones: " + isConus() + "\nTree height: " + getTreeHeight();
	}
}
