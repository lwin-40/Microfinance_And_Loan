package com.mdls.microfinancesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mdls.microfinancesystem.constant.GlobalConstant;
import com.mdls.microfinancesystem.entity.Customer;
import com.mdls.microfinancesystem.entity.Member;
import com.mdls.microfinancesystem.pojo.CustomerPojo;
import com.mdls.microfinancesystem.response.BaseResponse;
import com.mdls.microfinancesystem.service.CustomerService;
import com.mdls.microfinancesystem.service.MemberService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	MemberService memberService;
	
	@GetMapping(value="/customers")
	public BaseResponse getCustomer(Customer customer) {
		List<Customer> customers= customerService.getCustomer(customer);
		return new BaseResponse(GlobalConstant.SUCCESS, customers,GlobalConstant.Message.SUCCESS_MESSAGE);
	}
	@PostMapping(value="/customer")
	public BaseResponse  addCustomer(@RequestBody Customer customer)
	{
	
		try {
			
			 List<Member> members= customer.getMembers();
		        if(members !=null){
		           members= memberService.saveAll(members);
		        }

		        for(Member member :members){
		            customer.addMember(member);
		        }

		       customer = customerService.save(customer);
		}catch (Exception e) {
			System.out.println("Error occur "+e.getMessage());
			return new BaseResponse(1, null, "Error cannot create customer");
		}
		return new BaseResponse(0, customer, "Successfully created ");
	}
	@DeleteMapping(value="/customer/{id}")
	public void deleteById(@PathVariable Long id) {
		customerService.delete(id);
	}
	@PutMapping(value = "/customer")
	public Customer updateCustomer(@RequestBody CustomerPojo customerPojo) {
		
		Customer customer = customerService.findById(customerPojo.getCustomerId());
		if(customer==null) {
			return null;
		}
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setCustomerAddress(customerPojo.getCustomerAddress());
		customer.setCustomerNRC(customerPojo.getCustomerNRCNo());
		customer.setCustomerPhone(customerPojo.getCustomerPhone());
		customer.setCustomerOccupation(customerPojo.getCustomerOccupation());
	
		return customerService.save(customer);
		
	}
}
