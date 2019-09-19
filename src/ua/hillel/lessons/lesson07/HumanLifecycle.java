package ua.hillel.lessons.lesson07;

import java.util.Date;

/**
 * The class emulates lifecycle of the human
 * with important
 */

public class HumanLifecycle {
	private final IHumanLifecycleObserver observer;

	/**
	 *  Create an instance of the class
	 * @param observer The observer to notify about the lifecycle
	 */

	public HumanLifecycle(IHumanLifecycleObserver observer){
		this.observer = observer;
	}

	/**
	 *  Start the emulation of the human lifecycle.
	 *  It does not return, until the human dies.
	 */

	public void startLife(){
		IHumanLifecycleObserver.HumanBornParams bornParams =
				new IHumanLifecycleObserver.HumanBornParams();
		bornParams.birthdate = new Date();
		bornParams.weight = 3.14f;
		bornParams.gender = "female";
		observer.onHumanWasBorn(bornParams);
	}
}
