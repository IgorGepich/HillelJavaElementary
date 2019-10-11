package ua.hillel.lessons.lesson07.humanLifecycle;

public class MainLesson07Lifecycle {
	/**
	 * The main entry point
	 */
	public static void main(String[] args) {
		IHumanLifecycleObserver observer = new LoggingHumanLifecycleObserver();

		HumanLifecycle lifecycle = new HumanLifecycle(observer);

		// begin the life
		lifecycle.startLife();
	}
	private static class LoggingHumanLifecycleObserver implements IHumanLifecycleObserver{

		@Override
		public void onHumanWasBorn(HumanBornParams params) {
			System.out.println(String.format("Child name %s \nwas born %s \nwith wight %.2f \ngender %s",
					params.name, params.birthdate, params.weight, params.gender));
		}

		@Override
		public void onHumanKindergarten(KindergartenParams params) {
			System.out.println(String.format("Child name /s"));
		}


	}
}
