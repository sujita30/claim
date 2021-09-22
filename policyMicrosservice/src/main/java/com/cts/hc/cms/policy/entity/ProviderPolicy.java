package com.cts.hc.cms.policy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProviderPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long providerPolicyId;
	private Long policyId;
	private Long providerId;
	private String providerName;
	private String providerLocation;
	
	public ProviderPolicy() {
		super();
	}
	
	public ProviderPolicy(Long policyId, Long providerId, String providerName, String providerLocation) {
		super();
		this.policyId = policyId;
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerLocation = providerLocation;
	}
	public Long getProviderPolicyId() {
		return providerPolicyId;
	}
	public void setProviderPolicyId(Long providerPolicyId) {
		this.providerPolicyId = providerPolicyId;
	}
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public Long getProviderId() {
		return providerId;
	}
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getProviderLocation() {
		return providerLocation;
	}
	public void setProviderLocation(String providerLocation) {
		this.providerLocation = providerLocation;
	}
}
