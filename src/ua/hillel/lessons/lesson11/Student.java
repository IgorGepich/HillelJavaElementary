package ua.hillel.lessons.lesson11;

public class Student {
	private int age;
	private String name;

	public Student(String name) {
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		if (age <= 0 || age > 105) throw new IllegalArgumentException("Out of age parameters");
		this.age = age;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name can't be empty");
		this.name = name;
	}

	static Student deserialize(String name) throws MyDomainException {
		new Student(name);
		throw new MyDomainException("");
	}

	public static void secondDeserialize() throws MyDomainException{
		String name = "";
		try {
			Student.deserialize(name);
		} catch (MyDomainException e){
			System.out.println("Method error detected.");
			e.printStackTrace();
			throw e;
		}
	}

	public static void deserializeRuntime(){
		String name = "";
		try {
			Student.deserialize(name);
		} catch (MyDomainException e){
			System.out.println("Method error detected.");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
