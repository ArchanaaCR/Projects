package project3;

public class Details {
	
	Customer custStore[]= new Customer[2];
	Feedback feedbackStore[]= new Feedback[3];
	int index=0, index1=0;
	public static void main(String[] args) {
		
		Details details= new Details();
		Customer customer=new Customer(1, "Archanna");
		Customer customer1=new Customer(2,"Megha");
		details.addCustomer(customer);
		details.addCustomer(customer1);
		
		//Feedback fb= new Feedback();
		
		details.addfeedback(new Feedback(101,"Issue resolved soon",customer));
		details.addfeedback(new Feedback(102,"Fast resolution",customer1));
		details.addfeedback(new Feedback(103,"Could have done better",customer));
		details.fetchFeedback(1);
		
		customer1.changeName("Diviya");
		
		details.fetchFeedback(2);

	}
	
	public void addCustomer(Customer cus) {
		custStore[index++]=cus;
		System.out.println(index);
		
	}
	
	public void addfeedback(Feedback fb) {
		feedbackStore[index1++]=fb;
		System.out.println(index1);
	}
	
	public void fetchFeedback(int id) {
		for(Feedback feedback:feedbackStore) {
			if(feedback.getCustomer().getId()==id) {
				System.out.println("Feedback Id:  "+feedback.getFid()+" Feedback Description:  "+feedback.getDescription()+ "  Customer ID"+feedback.getCustomer().getId());
				System.out.println("Customer name: "+feedback.getCustomer().getName());
			}
		}
	}

}
