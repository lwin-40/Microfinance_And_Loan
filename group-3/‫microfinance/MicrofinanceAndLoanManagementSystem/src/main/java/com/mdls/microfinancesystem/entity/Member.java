package com.mdls.microfinancesystem.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="member")
@SequenceGenerator(name="seq", initialValue = 1, allocationSize = 100)

public class Member {
	@Id
	@GeneratedValue
	Long memberId;

	@Column(name = "member_type")
	private String memberType;
	
    @Column(name="member_groupName")
    private String memberGroupName;
    

    @Column( name = "customer_id")
    private Long customerId;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberGroupName() {
		return memberGroupName;
	}

	public void setMemberGroupName(String memberGroupName) {
		this.memberGroupName = memberGroupName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberType=" + memberType + ", memberGroupName=" + memberGroupName
				+ "]";
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	

	
	

	
}
