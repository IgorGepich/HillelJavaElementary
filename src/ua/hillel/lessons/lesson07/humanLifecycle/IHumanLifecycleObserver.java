package ua.hillel.lessons.lesson07.humanLifecycle;

import java.util.Date;
/**
 *  The interface defines an observer over {@link HumanLifecycle}
 */
public interface IHumanLifecycleObserver {

	/**
	 * Handles the first event in a human life.
	 * @param bornParams The stage parameters.
	 */

	void onHumanWasBorn(HumanBornParams bornParams);

	/**
	 * Handles the second event in a human life.
	 * @param kindergartenParams The stage parameters.
	 */

	void onHumanKindergarten(KindergartenParams kindergartenParams);

	/**
	 * Handles the third event in a human life.
	 * @param schoolParams The stage parameters.
	 */

	void onHumanSchoolYears(SchoolParams schoolParams);

	/**
	 * Handles the fourth event in a human life.
	 * @param instituteParams The stage parameters.
	 */
	void onHumanInstitute(InstituteParams instituteParams);

	/**
	 * Handles the fifth event in a human life.
	 * @param weddingParams The stage parameters.
	 */

	void onWedding(WeddingParams weddingParams);

	/**
	 * Handles the sixth event in a human life.
	 * @param childbirthParams The stage parameters.
	 */

	void onChildbirth(ChildbirthParams childbirthParams);

	/**
	 * Handles the seventh event in a human life.
	 * @param pensionParams The stage parameters.
	 */

	void onPension(PensionParams pensionParams);

	/**
	 * Handles the eighth event in a human life.
	 * @param gameOverParams stage parameters.
	 */

	void onGameOver(GameOverParams gameOverParams);

	/**
	 * Attributes of the born stage of a human
	 */

	class HumanBornParams{

	/**
	* HumanName the name of the human.
	* Birthdate the date when the human was born.
	* Weight the weight of the child in kilograms.
	* Gender the tolerant gender of the child.
	**/
		static String humanName;
		Date birthdate;
		float humanWeight;
		String gender;
	}

	/**
	 * Attributes of the kindergarten stage of a human.
	 */

	class KindergartenParams{

	/**
	* Age the age of the human.
	* Period the period that the child was in kindergarten.
	*/

		String name = HumanBornParams.humanName;
		int humanAge;
		int periodOfVisitGarden;
		int frequencyOfVisits;
	}

	/**
	 * Attributes of the school stage of a human.
	 */

	class SchoolParams{

		/**
		 * SchoolNumber
		 */

		int schoolNumber;
		int periodOfStudyingInSchool;

	}

	/**
	 * Attributes of the institute stage of a human.
	 */

	class InstituteParams{
		/**
		 * InstituteName the name of the institute where the human studied in.
		 * Faculty
		 * PeriodOfStudyingInInstitute
		 */

		String instituteName;
		String faculty;
		int periodOfStudyingInInstitute;
	}

	/**
	 * Attributes of the family life stage of a human.
	 */

	class WeddingParams{

		/**
		 * WifesName the name of the human wife.
		 * WifesAge human wifes name.
		 */

		String wifesName;
		int wifesAge;
	}

	/**
	 * Attributes of childbirth stage of a human.
	 */

	class ChildbirthParams {

		/**
		 * ChildName child name
		 * ChildWeight child weight
		 * ChildGender child gender
		 */

		String childName;
		float childWeight;
		String childGender;
	}

	/**
	 * Attributes of the pension stage of a human.
	 */

	class PensionParams{
		/**
		 * The country where the human lives in after retirement.
		 */
		String country;
	}

	/**
	 * Attributes of the end of life of the human.
	 */

	class GameOverParams{
		/**
		 * Disease cause of death
		 */
		String disease;
	}
}
