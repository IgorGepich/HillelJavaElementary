package ua.hillel.lessons.lesson05.printer;

public class Delegate {

	PrinterToCLI printerToCLI = new PrinterToCLI();

	Delegate(){
		printerToCLI.stringConverter();
	}
}
