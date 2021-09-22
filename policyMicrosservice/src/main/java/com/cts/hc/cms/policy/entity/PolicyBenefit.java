package com.cts.hc.cms.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PolicyBenefit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long policyBenefitId;

	@ManyToOne
	@JoinColumn(name = "policyId")
	private Policy policy;

	private String benefit;

	public PolicyBenefit() {
		super();
	}

	public PolicyBenefit(Policy policy, String benefit) {
		super();
		this.policy = policy;
		this.benefit = benefit;
	}

	public Long getPolicyBenefitId() {
		return policyBenefitId;
	}

	public void setPolicyBenefitId(Long policyBenefitId) {
		this.policyBenefitId = policyBenefitId;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
}
