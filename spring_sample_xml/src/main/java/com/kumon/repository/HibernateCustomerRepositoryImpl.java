package com.kumon.repository;

import java.util.ArrayList;
import java.util.List;

import com.kumon.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.kumon.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Cuong");
		customer.setLastname("Do");
		
		customers.add(customer);
		
		return customers;
	}
}
