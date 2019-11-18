package ua.hillel.lessons.lesson08;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainLesson08 {
	/**
	 * The main entry point.
	 */
	public static void main(String[] args) {

		int a =  5;
		String b = "ig";
		MyTestOptional<String> name = MyTestOptional.of("Igor");
			if(name.isPresent()) {
				System.out.println(name);
			}

		MyTestOptional<String> nameNext = MyTestOptional.ofNullble(null);
		assert nameNext.hashCode() == nameNext.hashCode();
		System.out.println(nameNext.hashCode());

		//Supplier
		Supplier<String> testOptionalSupplier = () ->
							{
								System.out.println("String for return.");
								return "Misha";
							};

		String otherName = nameNext.orElseGet(testOptionalSupplier);
		System.out.println(otherName);

		//ifPresent
		Consumer<String> printString = string -> System.out.println("No name");
		name.ifPresent(printString);
		nameNext.ifPresent(printString);
	}
}
