package com.maveric.apps.customerms.serivce;

import com.maveric.apps.customerms.domain.Customer;
import com.maveric.apps.customerms.exception.CustomerNotFoundException;
import com.maveric.apps.customerms.exception.InvalidIDException;
import com.maveric.apps.customerms.exception.InvalidInputCustomerException;

import java.util.List;

public interface ICustomerService {

    Customer register(String firstName, String lastName) throws InvalidInputCustomerException;
    Customer findById(int id) throws InvalidIDException, CustomerNotFoundException;
    List<Customer> findCustomersByFirstNameAscendingId(String firstName) throws InvalidInputCustomerException, CustomerNotFoundException;

}
