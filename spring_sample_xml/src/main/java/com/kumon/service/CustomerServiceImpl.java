package com.kumon.service;

import java.util.List;

import com.kumon.model.Customer;
import com.kumon.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	/* (non-Javadoc)
	 * @see com.kumon.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){		
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
