package ua.hillel.lessons.lesson07.humanLifecycle;

import java.util.Date;
/**
 *  The interface defines an observer over {@link HumanLifecycle}
 */
public interface IHumanLifecycleObserver {
	/**
	 * Handles the first event in a human life.
	 * @param params The stage parameters.
	 */
	// on - на событии, реакция на определенное действие, далее описание этого события
	void onHumanWasBorn(HumanBornParams params);
	void onHumanKindergarten(KindergartenParams params);
	/**
	 * Attributes of the born stage of a human
	 */
	class HumanBornParams{
	/**
	* @param name the name of the human.
	* @param birthdate the date when the human was born.
	* @param weight the weight of the child in kilograms.
	* @param gender the tolerant gender of the child.
	**/
		public String name;
		public Date birthdate;
		public float weight;
		public String gender;
	}

	class KindergartenParams{
		public int period;
	}


}
