package com.mdls.microfinancesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="guarantor")
@SequenceGenerator(name="seq", initialValue = 1, allocationSize = 100)
public class Guarantor {

	@Id
	@GeneratedValue
	Long guarantorId;

	@Column(name = "guarantor_Name")
	private String guarantorName;
	@Column(name = "guarantor_NRCNo")
	private String guarantorNRC;
	@Column(name = "guarantor_Address")
	private String guarantorAddress;
	@Column(name = "guarantor_Phone")
	private String guarantorPhone;
	@Column(name = "guarantor_Occupation")
	private String guarantorOccupation;
	public Long getGuarantorId() {
		return guarantorId;
	}
	public void setGuarantorId(Long guarantorId) {
		this.guarantorId = guarantorId;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorNRC() {
		return guarantorNRC;
	}
	public void setGuarantorNRC(String guarantorNRC) {
		this.guarantorNRC = guarantorNRC;
	}
	public String getGuarantorAddress() {
		return guarantorAddress;
	}
	public void setGuarantorAddress(String guarantorAddress) {
		this.guarantorAddress = guarantorAddress;
	}
	public String getGuarantorPhone() {
		return guarantorPhone;
	}
	public void setGuarantorPhone(String guarantorPhone) {
		this.guarantorPhone = guarantorPhone;
	}
	public String getGuarantorOccupation() {
		return guarantorOccupation;
	}
	public void setGuarantorOccupation(String guarantorOccupation) {
		this.guarantorOccupation = guarantorOccupation;
	}
	
	
}
