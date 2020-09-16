package inheritanceproject;

public class BoarderStudent extends Student {

	int roomNumber;

	public BoarderStudent(int id, String nm, int rn) {

		roomNumber = rn;
	}

	public BoarderStudent() {

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Room Number: " + roomNumber);
	}

}
