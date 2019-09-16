package ua.hillel.lessons.lesson04.apartment;

public class LivingRoom extends Apartment{

	public Apartment secondLivingRoom = new Apartment();
	public Window livingRoomWindow = new Window();
	public Sofa sofa = new Sofa();

	public Apartment secondLivingRoomCreate(){
		secondLivingRoom.setNewApartment("Living room", 3, 5, 6, false);
		livingRoomWindow.setWindow(120, 100, "Wood");
		sofa.sofaCreate();
		return secondLivingRoom;
	}

}
