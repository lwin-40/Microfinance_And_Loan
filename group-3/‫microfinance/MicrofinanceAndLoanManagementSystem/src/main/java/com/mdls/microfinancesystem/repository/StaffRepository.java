package com.mdls.microfinancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdls.microfinancesystem.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

}
