package com.cts.hc.cms.policy.service;

import java.util.List;

import com.cts.hc.cms.policy.model.Benefits;
import com.cts.hc.cms.policy.model.ProviderModel;

public interface PolicyService {


	//get providers by location
	public List<ProviderModel> getProvidersByLocation(long policyId);
	
	//get benefits by policy and member
	public List<Benefits> getBenefitsByPolicyIdMemberId(long policyId, long memberId);
}
