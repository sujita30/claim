/**
 * 
 */
package com.cts.hc.cms.policy.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author sujita
 *
 */
@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long policyId;
	
	@OneToMany(mappedBy = "policy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PolicyBenefit> benefits;
	
	private double premium;
	private  double tenure;
	private String policyName;
	
	public Policy() {
		super();
	}
	
	public Policy(Set<PolicyBenefit> benefits, double premium, double tenure, String policyName) {
		super();
		this.benefits = benefits;
		this.premium = premium;
		this.tenure = tenure;
		this.policyName = policyName;
	}


	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}


	public Set<PolicyBenefit> getBenefits() { 
		return benefits;
	}


	public void setBenefits(Set<PolicyBenefit> benefits) {
		this.benefits = benefits;
	}
	
	
	
}
