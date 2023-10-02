package project4;

public class Guest {
	
	private long gId;
	private String firstName;
	private String lastName;
	private String emailID;
	
	Guest(long id, String firstName, String lastName, String email){
		this.gId=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailID=email;
	}
	
	Guest(){
		
	}
	
	public long getGId() {
		return gId;
	}
	public void setGId(long id) {
		this.gId=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Guest [gId=" + gId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID=" + emailID
				+ "]";
	}
	

}
