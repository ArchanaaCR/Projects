package project4;

public class Room {
	private int roomNumber;
	private int floor;
	private Guest checkedIn;
	private String roomType; // deluxe or normal
	private double pricePerDay;
	public Room(int roomNumber, int floor, Guest checkedIn, String roomType, double pricePerDay) {
		super();
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.checkedIn = checkedIn;
		this.roomType = roomType;
		this.pricePerDay = pricePerDay;
	}
	public Room() {
		super();
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Guest getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Guest checkedIn) {
		this.checkedIn = checkedIn;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", floor=" + floor + ", checkedIn=" + checkedIn + ", roomType="
				+ roomType + ", pricePerDay=" + pricePerDay + "]";
	}
	
	
	
}
