package ua.hillel.lessons.lesson07.humanLifecycle;

public class MainLesson07Lifecycle {
	/**
	 * The main entry point
	 */
	public static void main(String[] args) {
		IHumanLifecycleObserver observer = new IHumanLifecycleObserver() {
			@Override
			public void onHumanWasBorn(HumanBornParams bornParams) {
				System.out.println(String.format("Child name %s \nwas born %s \nwith wight %.2f \ngender %s",
						HumanBornParams.humanName, bornParams.birthdate, bornParams.humanWeight, bornParams.gender));
			}

			@Override
			public void onHumanKindergarten(KindergartenParams kindergartenParams) {
				System.out.println(String.format("At the age of %d %s went to kindergarten for %d years " +
								"and visited the garden %s times a week",
						kindergartenParams.humanAge, kindergartenParams.name, kindergartenParams.periodOfVisitGarden,
						kindergartenParams.frequencyOfVisits));
			}

			@Override
			public void onHumanSchoolYears(SchoolParams schoolParams) {
				System.out.println(String.format("Studied at school number %d for %d years",
						schoolParams.schoolNumber, schoolParams.periodOfStudyingInSchool));
			}

			@Override
			public void onHumanInstitute(InstituteParams instituteParams) {
				System.out.println(String.format("Throughout %d years studied at %s on %s faculty.",
						instituteParams.periodOfStudyingInInstitute, instituteParams.instituteName, instituteParams.faculty));
			}

			@Override
			public void onWedding(WeddingParams weddingParams) {
				System.out.println(String.format("Wife: \nage %s wifes name: %s",
						weddingParams.wifesAge, weddingParams.wifesName));
			}

			@Override
			public void onChildbirth(ChildbirthParams childbirthParams) {
				System.out.println(String.format("Child: \nname %s \ngender: %s \nweight: %.2f kilograms.",
						childbirthParams.childName, childbirthParams.childGender,childbirthParams.childWeight));
			}

			@Override
			public void onPension(PensionParams pensionParams) {
				System.out.println(String.format("Retired moved to %s", pensionParams.country));
			}

			@Override
			public void onGameOver(GameOverParams gameOverParams) {
				System.out.println(String.format("Died of a %s", gameOverParams.disease));
			}

		};

		HumanLifecycle lifecycle = new HumanLifecycle(observer);

		// begin the life
		lifecycle.startLife();
		lifecycle.kindergarten();
		lifecycle.school();
		lifecycle.institute();
		lifecycle.wedding();
		lifecycle.childbirth();
		lifecycle.pension();
		lifecycle.gameOver();
		//end of life

	}
}
