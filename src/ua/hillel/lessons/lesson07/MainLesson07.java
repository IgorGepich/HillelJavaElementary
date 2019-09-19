package ua.hillel.lessons.lesson07;

public class MainLesson07 {
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
			System.out.println(String.format("Child was born %s with wight %.2f and gender %s",
					params.birthdate, params.weight, params.gender));

		}
	}
}
