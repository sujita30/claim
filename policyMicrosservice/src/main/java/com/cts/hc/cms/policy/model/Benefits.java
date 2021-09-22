package com.cts.hc.cms.policy.model;

public class Benefits {

	private long benefitId;
	private String benefitName;
	
	
	public Benefits() {
		super();
	}

	public Benefits(long benefitId, String benefitName) {
		super();
		this.benefitId = benefitId;
		this.benefitName = benefitName;
	}
	
	public long getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(long benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitName() {
		return benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	
}
