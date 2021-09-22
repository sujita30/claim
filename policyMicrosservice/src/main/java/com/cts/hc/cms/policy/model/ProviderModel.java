package com.cts.hc.cms.policy.model;

public class ProviderModel {

	private long providerId;
	private String providerName;
	private String providerLocation;

	public ProviderModel(long providerId, String providerName, String providerLocation) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerLocation = providerLocation;
	}

	public long getProviderId() {
		return providerId;
	}

	public void setProviderId(long providerId) {
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
