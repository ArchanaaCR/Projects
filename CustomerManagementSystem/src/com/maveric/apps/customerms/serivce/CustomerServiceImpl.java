package com.maveric.apps.customerms.serivce;

import com.maveric.apps.customerms.domain.Customer;
import com.maveric.apps.customerms.exception.CustomerNotFoundException;
import com.maveric.apps.customerms.exception.InvalidIDException;
import com.maveric.apps.customerms.exception.InvalidInputCustomerException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService{
    int generatedId=0;
    public int getGeneratedID(){
        return ++generatedId;
    }

    private Map<Integer, Customer> store= new LinkedHashMap<>();


    @Override
    public Customer register(String firstName, String lastName) throws InvalidInputCustomerException {
        int id = getGeneratedID();
        Customer customer=null;
        //need to check for null in separate method
        if ((firstName.length() > 2 && firstName.length() <= 10) && (lastName.length() >= 2 && lastName.length() <= 10)) {
            customer = new Customer(id, firstName, lastName);
            store.put(id, customer);
            return customer;
        }
            throw new InvalidInputCustomerException("Invalid input error");

    }

    @Override
    public Customer findById(int id) throws InvalidIDException, CustomerNotFoundException {
        //Customer customer = null;
        validateId(id);
        Customer customer =store.get(id);
       /* for (Map.Entry<Integer, Customer> entry : store.entrySet()) {
            if (entry.getKey() == id) {
                customer = entry.getValue();
                break;
            }
        }*/
        if(customer==null){
            throw new CustomerNotFoundException("Customer not found for this ID= "+id);
        }

        return customer;
    }
    public void validateId(int id) throws InvalidIDException {
        if(id<1) {
            throw new InvalidIDException("Please enter the valid ID above 1");
        }
    }
    @Override
    public List<Customer> findCustomersByFirstNameAscendingId(String firstName) throws InvalidInputCustomerException, CustomerNotFoundException {
        validateGivenString(firstName); //validation should be in first line.
        List<Customer> customers=new ArrayList<>();
        for(Customer customer:store.values()) {
            if (customer.getFirstName().toLowerCase().startsWith(firstName.toLowerCase())) {
                customers.add(customer);
            }
        }
        if(customers.isEmpty()){
                throw  new CustomerNotFoundException("The Customer for this name is not found");
        }
        customers.sort((new SortByIdComparator()));
        return  customers;
    }
    public void validateGivenString(String firstName) throws InvalidInputCustomerException{
        if(firstName.length()<3){
            throw new InvalidInputCustomerException("Insufficient text for search, the input should be greater than 3 characters");
        }
    }
}
