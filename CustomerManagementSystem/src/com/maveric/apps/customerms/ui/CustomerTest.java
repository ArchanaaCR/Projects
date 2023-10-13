package com.maveric.apps.customerms.ui;

import com.maveric.apps.customerms.domain.Customer;
import com.maveric.apps.customerms.exception.CustomerNotFoundException;
import com.maveric.apps.customerms.exception.InvalidIDException;
import com.maveric.apps.customerms.exception.InvalidInputCustomerException;
import com.maveric.apps.customerms.serivce.CustomerServiceImpl;
import com.maveric.apps.customerms.serivce.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    private static ICustomerService customerService = new CustomerServiceImpl();
    List<Customer> customers=new ArrayList<>();
    public static void main(String[] args)  {

        CustomerTest test= new CustomerTest();
        test.app();
    }

    public void app() {
        //registering customer.
        try {
            Customer customer = customerService.register("Archanaa", "Cr");
            customers.add(customer);
            Customer customer1 = customerService.register("Diviya", "Karun");
            customers.add(customer1);
            Customer customer2 = customerService.register("Tarani", "Pandian");
            customers.add(customer2);
            Customer customer3 = customerService.register("Archu", "Pandian");
            customers.add(customer3);
            Customer customer4 = customerService.register("Archanaa", "Pandian");
            customers.add(customer4);

            if (customers != null) {
                for (Customer cust : customers) {
                    /*System.out.println("Customer: id:" + cust.getId() + ", firstname= " + cust.getFirstName() + "" +
                            ", lastname= " + cust.getLastName());*/
                    display(cust);
                }
            }
        } catch (InvalidInputCustomerException e) {
            System.out.println(e.getMessage());
        }

        //finding customer by id

        try {
            Customer customer = customerService.findById(10);
            /*System.out.println("Customer: id:" + customer.getId() + ", firstname= " + customer.getFirstName() + "" +
                    ", lastname= " + customer.getLastName());*/
            display(customer);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InvalidIDException e) {
            System.out.println(e.getMessage());
        }

        //find customer by start letter and order by id.
        try {
            List<Customer> customer = customerService.findCustomersByFirstNameAscendingId("Arch");
            if (customer != null) {
                for (Customer cust : customer) {
                     /*System.out.println("Customer: id:" + customer.getId() + ", firstname= " + customer.getFirstName() + "" +
                    ", lastname= " + customer.getLastName());*/
                    display(cust);
                }
            }
        } catch (InvalidInputCustomerException e) {
            System.out.println(e.getMessage());

        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
    public void display(Customer cust){
        System.out.println("Customer: id:" + cust.getId() + ", firstname= " + cust.getFirstName() + "" +
                ", lastname= " + cust.getLastName());
    }

}
