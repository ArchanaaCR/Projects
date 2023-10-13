package com.maveric.apps.customerms.ui;
/*
import com.maveric.apps.customerms.domain.Customer;
import com.maveric.apps.customerms.exception.InvalidInputCustomerException;
import com.maveric.apps.customerms.serivce.CustomerServiceImpl;
import com.maveric.apps.customerms.serivce.ICustomerService;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        ICustomerService customerService = new CustomerServiceImpl();
        App test = new App();

        //registering customer.
        System.out.println("Please enter your details for registering");
        Customer customer = test.registerCustomer();
        Customer customer1 = null;
        try {
            customer1 = customerService.register(customer.getFirstName(), customer.getLastName());
        } catch (InvalidInputCustomerException e) {
            System.out.println("Please enter the valid name" + e.getMessage());
        }
        if (customer1 != null) {
            System.out.println("id:" + customer1.getId() + "  firstname:  " + customer1.getFirstName() + "  " +
                    "lastName:  " + customer1.getLastName());
        }

    }

    public Customer registerCustomer() {
        String firstName, lastName;
        Customer customer= new Customer();

            do {
                System.out.println("Please enter your first name: ");
                firstName = in.nextLine();
            } while (firstName == null || !(firstName.length() > 2 && firstName.length() <= 10));
            customer.setFirstName(firstName);

        do{
            System.out.println("Please enter your last name: ");
            lastName=in.nextLine();
        }while(lastName == null || !(lastName.length()>=2 && lastName.length()<=10));
        customer.setLastName(lastName);
        return customer;
    }
}
*/