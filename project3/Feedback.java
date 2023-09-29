package project3;

public class Feedback {
	
	private int fid;
	private String description;
	private Customer customer;
	
	public Feedback(int fid, String description, Customer customer) {
		this.fid = fid;
		this.description = description;
		this.customer = customer;
	}
	
	public Feedback() {
		super();
	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", description=" + description + ", customer=" + customer + "]";
	}
	
	

}
