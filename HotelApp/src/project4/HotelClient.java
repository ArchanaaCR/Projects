package project4;

public class HotelClient {
	Room roomArr[]= new Room[8];
	Guest guestArr[]= new Guest[10];
	int roomIndex=0;
	int guestIndex=0;
	
	HotelAppService hs= new HotelAppService(roomArr, guestArr, roomIndex, guestIndex);
	
	
	public static void main(String[] args) {
		
		
		HotelClient hc= new HotelClient();
		hc.register();
		hc.hs.findGuestCheckedInRoom(1);
		int guestCount=hc.hs.guestsCount();
		System.out.println("GuestCount in the hotel currently="+guestCount);
		double totalAmout=hc.hs.earningToday();
		System.out.println("Earning today="+totalAmout);
		Guest[] guestDetails=hc.hs.findAllGuests();
		System.out.print("All guest details: ");
		for (int i=0; i<guestDetails.length;i++) {
			System.out.println(guestDetails[i]);
		}
		

	}
	
	public void register() {
		Guest guest1=hs.addGuest("Archanaa", "C R", "arch@gmail.com");
		Guest guest2=hs.addGuest("Chitra", "R", "chitra@gmail.com");
		Guest guest3=hs.addGuest("Rajapandian", "A M", "raja@gmail.com");
		Guest guest4=hs.addGuest("Nikin", "M", "niki@gmail.com");
		Guest guest5=hs.addGuest("Tom", "Jerry", "tom@gmail.com");
		
		Room room1=hs.addRomm(1, guest1, "Normal", 2345.90);
		Room room2=hs.addRomm(1, null, "Delux", 4345.90);
		Room room3=hs.addRomm(1, guest2, "Delux", 4345.90);
		Room room4=hs.addRomm(1, null, "Normal", 2345.90);
		Room room5=hs.addRomm(2, guest3, "Delux", 5345.90);
		Room room6=hs.addRomm(2, guest4, "Normal", 2945.90);
		Room room7=hs.addRomm(2, null, "Delux", 5345.90);
		Room room8=hs.addRomm(2, guest5, "Normal", 2945.90);
		
		Hotel hotel=hs.addHotel("Langford");
	}
	
	

}
