package com.mdls.microfinancesystem.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="loan")
public class Loan {
	@Id
	@GeneratedValue
	long id;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column
	private LocalDate loandedDate;
	@OneToOne
	@JoinColumn(name="staff_id")
	private Staff staff;
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="guarantor_id")
	private Guarantor guarantor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getLoandedDate() {
		return loandedDate;
	}
	public void setLoandedDate(LocalDate loandedDate) {
		this.loandedDate = loandedDate;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public Guarantor getGuarantor() {
		return guarantor;
	}
	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", loandedDate=" + loandedDate + ", staff=" + staff + ", customer=" + customer
				+ ", guarantor=" + guarantor + "]";
	}
	
	
}
