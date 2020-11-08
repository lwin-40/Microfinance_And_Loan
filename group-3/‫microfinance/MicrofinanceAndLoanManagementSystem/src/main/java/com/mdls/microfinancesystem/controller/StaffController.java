package com.mdls.microfinancesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mdls.microfinancesystem.entity.Staff;
import com.mdls.microfinancesystem.service.StaffService;

@RestController
public class StaffController {
	
@Autowired
StaffService staffService;

@GetMapping(value="/staffs")
public List<Staff> getStaff(Staff staff){
	return staffService.getStaff(staff);
}
@PostMapping(value="/staff")
public Staff createStaff(@RequestBody Staff staff) {
	return staffService.save(staff);
}
@DeleteMapping(value="/staff/{id}")
public void deleteById(@PathVariable Long id) {
	staffService.delete(id);
}
}
