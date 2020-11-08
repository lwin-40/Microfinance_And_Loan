package com.mdls.microfinancesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="staff")
@SequenceGenerator(name="seq", initialValue = 1, allocationSize = 100)
public class Staff {
	@Id
	@GeneratedValue
	Long staffId;

	@Column(name = "staff_Name")
	private String staffName;
	@Column(name = "staff_NRCNo")
	private String staffNRCNo;
	@Column(name = "staff_Email")
	private String staffEmail;
	@Column(name = "staff_Address")
	private String staffAddress;
	@Column(name = "staff_Phone")
	private String staffPhone;
	@Column(name = "staff_Password")
	private String staffPassword;
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffNRCNo() {
		return staffNRCNo;
	}
	public void setStaffNRCNo(String staffNRCNo) {
		this.staffNRCNo = staffNRCNo;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	
	
}
