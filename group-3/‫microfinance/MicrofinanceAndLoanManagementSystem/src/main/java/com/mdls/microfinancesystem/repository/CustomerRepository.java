package com.mdls.microfinancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdls.microfinancesystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
