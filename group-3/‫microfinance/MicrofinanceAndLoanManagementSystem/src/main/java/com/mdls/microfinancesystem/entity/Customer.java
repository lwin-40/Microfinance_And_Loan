package com.mdls.microfinancesystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="customer")
@SequenceGenerator(name="seq", initialValue = 1, allocationSize = 100)
public class Customer {
	@Id
	@GeneratedValue
	Long customerId;

	@Column(name = "customer_Name")
	private String customerName;
	@Column(name = "customer_NRCNo")
	private String customerNRC;
	@Column(name = "customer_Address")
	private String customerAddress;
	@Column(name = "customer_Phone")
	private String customerPhone;
	@Column(name = "customer_Occupation")
	private String customerOccupation;
	
	@OneToMany
    @JoinColumn(name="customer_Id")
    private List<Member> members;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNRC() {
		return customerNRC;
	}
	public void setCustomerNRC(String customerNRC) {
		this.customerNRC = customerNRC;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerOccupation() {
		return customerOccupation;
	}
	public void setCustomerOccupation(String customerOccupation) {
		this.customerOccupation = customerOccupation;
	}
	
	public List<Member> getMembers() {
		return members;
	}
	
	
	public void addMember(Member member) {
        if (members==null) {
            members = new ArrayList<Member>();
        }
        if (!members.contains(member)) {
            members.add(member);
        }
    }
public void setMembers(List<Member> members) {
		
		this.members = members;
	}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerNRC=" + customerNRC
			+ ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone + ", customerOccupation="
			+ customerOccupation + ", members=" + members + "]";
}
	
	 
}
