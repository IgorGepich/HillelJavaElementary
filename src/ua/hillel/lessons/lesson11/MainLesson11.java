package ua.hillel.lessons.lesson11;

public class MainLesson11 {
	public static void main(String[] args) {

		try{
		Student.deserialize(null);
		} catch (MyDomainException e){
			System.out.println("Wrong value for name field");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("intercept Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block.");
		}

		try{
			Student.secondDeserialize();
		} catch (MyDomainException e) {
			System.out.println("Method exception.");
		} catch (Exception e){
			System.out.println("intercept Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block.");
		}
		Student.deserializeRuntime();
	}
}
