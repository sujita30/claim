package com.cts.hc.cms.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MemberPolicyBenefit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberPolicyBenefitId;

	@ManyToOne
	@JoinColumn(name = "memberPolicyId")
	private MemberPolicy memberPolicy;

	private String benefit;

	public MemberPolicyBenefit() {
		super();
	}

	public MemberPolicyBenefit(MemberPolicy memberPolicy, String benefit) {
		super();
		this.memberPolicy = memberPolicy;
		this.benefit = benefit;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Long getMemberPolicyBenefitId() {
		return memberPolicyBenefitId;
	}

	public void setMemberPolicyBenefitId(Long memberPolicyBenefitId) {
		this.memberPolicyBenefitId = memberPolicyBenefitId;
	}

	public MemberPolicy getMemberPolicy() {
		return memberPolicy;
	}

	public void setMemberPolicy(MemberPolicy memberPolicy) {
		this.memberPolicy = memberPolicy;
	}

	
}
