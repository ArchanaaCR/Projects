package project4;

public class HotelAppService {

	//defining array for Room, Guest.
	Room roomArr[];
	Guest guestArr[];

	//defining index for Room, Guest.
	int roomIndex;
	int guestIndex;



	public HotelAppService(Room[] roomArr, Guest[] guestArr, int roomIndex,  int guestIndex) {
		super();
		this.roomArr = roomArr;
		this.guestArr = guestArr;
		this.roomIndex=roomIndex;
		this.guestIndex=guestIndex;
	}

	//auto increment() for id of Room, Guest.
	int generateRoomId=0;
	public int generatedRoomId() {
		return ++generateRoomId;
	}

	int generateGuestId=0;
	public int generatedGuestId() {
		return ++generateGuestId;
	}

	//adding room to the object.
	public Room addRomm(int floor, Guest checkedIn, String roomType, double pricePerDay) {
		int roomNumber= generatedRoomId();
		Room room= new Room(roomNumber, floor, checkedIn, roomType, pricePerDay);
		roomArr[roomIndex++]=room;

		System.out.println(roomArr[roomIndex-1]);
		return room;

	}

	//adding guest to the object.
	public Guest addGuest(String firstName, String lastName, String email) {
		int guestid=generatedGuestId();
		Guest guest= new Guest(guestid, firstName, lastName, email);
		guestArr[guestIndex++]=guest;

		System.out.println(guestArr[guestIndex-1]);
		return guest;
	}

	//adding hotel to the object.
	public Hotel addHotel(String name) {
		Hotel hotel= new Hotel(name, roomArr);
		System.out.println(hotel);
		return hotel;

	}

	public Guest findGuestCheckedInRoom(int roomId) {
		Guest guest=new Guest();
		for(Room room:roomArr) {
			if(room.getRoomNumber()==roomId) {
				if(room.getCheckedIn()!=null) {
					guest=room.getCheckedIn();
					if(guest!=null & guest.getGId()!=0) {
						System.out.println("guest details"+guest);
					}
				}
			}
		}
		return guest;
	}

	public int guestsCount() {
		int guestCount=0;
		for(Room room:roomArr) {
			Guest checkin= room.getCheckedIn();
			if(checkin!= null &&room.getCheckedIn().getGId()!=0) {
				guestCount++;
			}

		}

		return guestCount;
	}

	public double earningToday() {
		double totalAmount=0;
		for(Room room:roomArr) {
			Guest checkin= room.getCheckedIn();
			if(checkin!= null &&room.getCheckedIn().getGId()!=0) {
				totalAmount+=room.getPricePerDay();
			}

		}
		return totalAmount; // add prices of rooms where guest is staying
	}

	public Guest[] findAllGuests() {
		int guestcount=guestsCount(),index=0;
		Guest guest1[]= new Guest[guestcount];
		for(Guest guest:guestArr) {
			if(guest!=null) {
				guest1[index]=guest;
				index++;
			}
		}
		
		return guest1;

	}

}
