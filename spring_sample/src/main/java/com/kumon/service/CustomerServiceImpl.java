package com.kumon.service;

import java.util.List;

import com.kumon.model.Customer;
import com.kumon.repository.CustomerRepository;
import com.kumon.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.kumon.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){		
		return customerRepository.findAll();
	}
}
