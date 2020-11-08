package com.mdls.microfinancesystem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="loan")
@SequenceGenerator(name="seq", initialValue = 1, allocationSize = 100)
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY , generator ="seq")
	Long loanId;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="loanded_date")
	private LocalDate loandedDate;
	
	@OneToOne
	@JoinColumn(name="loan_Id")
	private Customer customer;
	
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public LocalDate getLoandedDate() {
		return loandedDate;
	}
	public void setLoandedDate(LocalDate loandedDate) {
		this.loandedDate = loandedDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
