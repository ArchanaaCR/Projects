package project4;

import java.util.Arrays;

public class Hotel {
	
	private String name;
	private Room[] rooms;


	public Hotel(String name, Room[] rooms) {
		this.name = name;
		this.rooms = rooms;
	}
	
	public Hotel() {
	
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rooms=" + Arrays.toString(rooms) + "]";
	}

	

}
