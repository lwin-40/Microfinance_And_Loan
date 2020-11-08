package com.mdls.microfinancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdls.microfinancesystem.entity.Guarantor;

@Repository
public interface GuarantorRepository extends JpaRepository<Guarantor, Long>{

}
