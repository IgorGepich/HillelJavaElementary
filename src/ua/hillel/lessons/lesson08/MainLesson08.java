package ua.hillel.lessons.lesson08;

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

		MyTestOptional<String> nameNext = MyTestOptional.of("Nastia");
		assert nameNext.hashCode() == nameNext.hashCode();
		System.out.println(nameNext.hashCode());
	}
}
