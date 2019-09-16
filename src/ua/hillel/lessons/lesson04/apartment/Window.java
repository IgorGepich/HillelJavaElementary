package ua.hillel.lessons.lesson04.apartment;

public class Window {
	private static double windowHeight;
	private static double windowWidth;
	private static String windowMaterial;

	public static double getWindowHeight() {
		return windowHeight;
	}

	public static double getWindowWidth() {
		return windowWidth;
	}

	public String getWindowMaterial() {
		return windowMaterial;
	}

	public static double getWindowSquare(){
		return windowHeight * windowWidth;
	}

	public Window(){}

	public void setWindow(double windowHeight, double windowWidth, String windowMaterial) {
		Window.windowHeight = windowHeight;
		Window.windowWidth = windowWidth;
		Window.windowMaterial = windowMaterial;
	}

	@Override
	public String toString(){
		return "\nWindow height: " + getWindowHeight() + " cm. \nWindow width: " + getWindowWidth()
				+ " cm. \nWindow material: " + getWindowMaterial();
	}
}
