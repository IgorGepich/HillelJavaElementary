package ua.hillel.lessons.lesson07;

import java.util.Date;

/**
 *  The interface defines an observer over {@link HumanLifecycle}
 */
public interface IHumanLifecycleObserver {
	// on - на событии, реакция на определенное действие, далее описание этого события


//	void onHumanWasBorn(Date birthdate, float weight, String gender);
	void onHumanWasBorn(HumanBornParams params);

	class HumanBornParams{
		public Date birthdate;
		public float weight;
		/**
		 *  The tolerant gender of the child
		 */
		public String gender;
	}
}
