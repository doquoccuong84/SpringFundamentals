package com.kumon.repository;

import java.util.List;

import com.kumon.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}