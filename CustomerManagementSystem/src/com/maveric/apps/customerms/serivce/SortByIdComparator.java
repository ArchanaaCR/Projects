package com.maveric.apps.customerms.serivce;

import com.maveric.apps.customerms.domain.Customer;

import java.util.Comparator;

public class SortByIdComparator implements Comparator<Customer> {
//    @Override
//    public int compare(Customer o1, Customer o2) {
//        return o1.getId()-o2.getId();
//    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        Customer cust1= (Customer) o1;
//        Customer cust2= (Customer) o2;
//        return cust1.getId()-cust2.getId();
//    }

    @Override
    public int compare(Customer cust1, Customer cust2) {
        return cust1.getId()-cust2.getId();
    }
}
