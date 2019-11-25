package ua.hillel.lessons.lesson07.humanLifecycle;

import java.util.Date;

/**
 * The class emulates lifecycle of the human
 * with important stages  of their lives.
 */

class HumanLifecycle {
	private final IHumanLifecycleObserver observer;

	/**
	 * Create an instance of the class
	 * @param observer The observer to notify about the lifecycle
	 */

	HumanLifecycle(IHumanLifecycleObserver observer){
		this.observer = observer;
	}

	/**
	 * Start the emulation of the human lifecycle.
	 * It does not return, until the human dies.
	 */

	void startLife(){
		IHumanLifecycleObserver.HumanBornParams bornParams =
				new IHumanLifecycleObserver.HumanBornParams();
		IHumanLifecycleObserver.HumanBornParams.humanName = "Igor";
		bornParams.birthdate = new Date();
		bornParams.humanWeight = 3.14f;
		bornParams.gender = "male";
		observer.onHumanWasBorn(bornParams);
	}

	/**
	 * This period describing walking in kindergarten.
	 */

	void kindergarten(){
		IHumanLifecycleObserver.KindergartenParams kindergartenParams =
				new IHumanLifecycleObserver.KindergartenParams();
		kindergartenParams.periodOfVisitGarden = 2;
		kindergartenParams.humanAge = 5;
		kindergartenParams.frequencyOfVisits = 5;
		observer.onHumanKindergarten(kindergartenParams);
	}

	/**
	 * This period describes school years of the human.
	 */

	void school(){
		IHumanLifecycleObserver.SchoolParams schoolParams =
				new IHumanLifecycleObserver.SchoolParams();
		schoolParams.schoolNumber = 1;
		schoolParams.periodOfStudyingInSchool = 10;
		observer.onHumanSchoolYears(schoolParams);
	}

	/**
	 * This period describes institutes years of the human.
	 */

	void institute(){
		IHumanLifecycleObserver.InstituteParams instituteParams =
				new IHumanLifecycleObserver.InstituteParams();
		instituteParams.instituteName = "Kharkiv National University";
		instituteParams.faculty = "Economic";
		instituteParams.periodOfStudyingInInstitute = 5;
		observer.onHumanInstitute(instituteParams);
	}

	/**
	 * The period describes the wedding period of life.
	 */

	void wedding(){
		IHumanLifecycleObserver.WeddingParams weddingParams =
				new IHumanLifecycleObserver.WeddingParams();
		weddingParams.wifesAge = 25;
		weddingParams.wifesName = "Masha";
		observer.onWedding(weddingParams);
	}

	/**
	 * The period describes the birth of a child
	 */

	void childbirth(){
		IHumanLifecycleObserver.ChildbirthParams childbirthParams =
				new IHumanLifecycleObserver.ChildbirthParams();
		childbirthParams.childName = "Mark";
		childbirthParams.childWeight = 3.13f;
		childbirthParams.childGender = "male";
		observer.onChildbirth(childbirthParams);
	}

	/**
	 * The period describes pension.
	 */

	void pension(){
		IHumanLifecycleObserver.PensionParams pensionParams =
				new IHumanLifecycleObserver.PensionParams();
		pensionParams.country = "Honolulu";
		observer.onPension(pensionParams);
	}

	/**
	 * End of Life.
	 */

	void gameOver(){
		IHumanLifecycleObserver.GameOverParams gameOverParams =
				new IHumanLifecycleObserver.GameOverParams();
		gameOverParams.disease = "stroke";
		observer.onGameOver(gameOverParams);
	}
}
