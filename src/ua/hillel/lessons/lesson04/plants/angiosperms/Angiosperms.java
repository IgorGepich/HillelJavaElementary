package ua.hillel.lessons.lesson04.plants.angiosperms;

import ua.hillel.lessons.lesson04.plants.SeedPlants;

/**
 * Angiosperms - Покрытосеменные растения, цветковые растения
 */
public class Angiosperms extends SeedPlants {

	/**
	 * @param angiospermsGroup blooming (цветущие) || fruit berry (плодово ягодные)
	 * @param periodOfLife annual (однолетние) || perennial (многолетние)
	 */
	private String angiospermsGroup;
	private String fruitType;
	private String plantName;
	private String root;
	private String periodOfLife;
	private boolean flowers;


	String getAngiospermsGroup() {
		return angiospermsGroup;
	}

	void setAngiospermsGroup(String angiospermsGroup) {
		this.angiospermsGroup = angiospermsGroup;
	}

	String getFruitType() {
		return fruitType;
	}

	void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	String getPlantName() {
		return plantName;
	}

	void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	String getRoot() {
		return root;
	}

	void setRoot(String root) {
		this.root = root;
	}

	String getPeriodOfLife() {
		return periodOfLife;
	}

	void setPeriodOfLife(String periodOfLife) {
		this.periodOfLife = periodOfLife;
	}

	boolean isFlowers() {
		return flowers;
	}

	void setFlowers(boolean flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString(){
		return "\nSeed group: " + getSeedGroup() + "" + "\nAngiosperms group: " + getAngiospermsGroup()
				+ "\nPlant name: " + getPlantName() + "\nLife period: " + getPeriodOfLife();
	}
}
