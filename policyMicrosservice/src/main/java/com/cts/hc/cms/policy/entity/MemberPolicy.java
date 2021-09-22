package com.cts.hc.cms.policy.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MemberPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberPolicyId;
	private Long policyId;
	private Long memberId;
	private LocalDate subscriptionDate;
	private double tenure;

	@OneToMany(mappedBy = "memberPolicy", cascade = CascadeType.ALL)
	private Set<MemberPolicyBenefit> benefits;

	private double capAmtForBeneits;

	public MemberPolicy() {
		super();
	}

	public MemberPolicy(Long policyId, Long memberId, LocalDate subscriptionDate, double tenure,
			Set<MemberPolicyBenefit> benefits, double capAmtForBeneits) {
		super();
		this.policyId = policyId;
		this.memberId = memberId;
		this.subscriptionDate = subscriptionDate;
		this.tenure = tenure;
		this.benefits = benefits;
		this.capAmtForBeneits = capAmtForBeneits;
	}

	public Long getMemberPolicyId() {
		return memberPolicyId;
	}

	public void setMemberPolicyId(Long memberPolicyId) {
		this.memberPolicyId = memberPolicyId;
	}

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getCapAmtForBeneits() {
		return capAmtForBeneits;
	}

	public void setCapAmtForBeneits(double capAmtForBeneits) {
		this.capAmtForBeneits = capAmtForBeneits;
	}

	public Set<MemberPolicyBenefit> getBenefits() {
		return benefits;
	}

	public void setBenefits(Set<MemberPolicyBenefit> benefits) {
		this.benefits = benefits;
	}

}
