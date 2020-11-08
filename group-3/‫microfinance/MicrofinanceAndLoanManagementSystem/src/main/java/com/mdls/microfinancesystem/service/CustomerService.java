package com.mdls.microfinancesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdls.microfinancesystem.entity.Customer;
import com.mdls.microfinancesystem.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getCustomer(Customer customer) {
		return customerRepository.findAll();
	}

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	public void delete(Long id) {
		customerRepository.deleteById(id);
		
	}
	public Customer findById(long id) {
		return customerRepository.findById(id).orElse(null);
	}
}
