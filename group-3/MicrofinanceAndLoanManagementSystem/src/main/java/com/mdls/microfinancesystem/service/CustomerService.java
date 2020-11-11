package com.mdls.microfinancesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.mdls.microfinancesystem.entity.Customer;
import com.mdls.microfinancesystem.entity.Member;
import com.mdls.microfinancesystem.repository.CustomerRepository;
import com.mdls.microfinancesystem.repository.MemberRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	MemberRepository memberRepository;

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

	public List<Customer> searchCustomer(String customerName){
		return customerRepository.searchCustomer(customerName);
	}
		   public List<Customer> findByMemberId(Long memberId){
			   return customerRepository.findByMemberId(memberId);
		   }
}
