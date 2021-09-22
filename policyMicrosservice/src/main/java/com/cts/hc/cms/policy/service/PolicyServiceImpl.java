package com.cts.hc.cms.policy.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hc.cms.policy.entity.MemberPolicy;
import com.cts.hc.cms.policy.entity.ProviderPolicy;
import com.cts.hc.cms.policy.model.Benefits;
import com.cts.hc.cms.policy.model.ProviderModel;
import com.cts.hc.cms.policy.repo.MemberPolicyRepo;
import com.cts.hc.cms.policy.repo.PolicyBenefitRepo;
import com.cts.hc.cms.policy.repo.PolicyRepo;
import com.cts.hc.cms.policy.repo.ProviderPolicyRepo;

@Service
public class PolicyServiceImpl implements PolicyService{
	
	
	@Autowired
	private ProviderPolicyRepo providerPolicyRepo;
	
	@Autowired
	private MemberPolicyRepo memberPolicyRepo; 
	

	@Override
	public List<ProviderModel> getProvidersByLocation(long policyId) {
		List<ProviderPolicy> providers = providerPolicyRepo.findByPolicyId(policyId);
		
		 List<ProviderModel> providersByLocation = providers.stream()
				.sorted(Comparator.comparing(ProviderPolicy::getProviderLocation))
				.map(e -> new ProviderModel(e.getProviderId(), e.getProviderName(), e.getProviderLocation()))
				.collect(Collectors.toList());
		
		return providersByLocation;
	}

	@Override
	public List<Benefits> getBenefitsByPolicyIdMemberId(long policyId, long memberId) {
		
		MemberPolicy lstmemberPolicy = memberPolicyRepo.findByPolicyIdAndMemberId(policyId, memberId);
		List<Benefits> lstBenefits = null;
		if(lstmemberPolicy != null ) {
			lstBenefits = lstmemberPolicy.getBenefits().stream()
			.map(e -> new Benefits(e.getMemberPolicyBenefitId(), e.getBenefit()))
			.collect(Collectors.toList());
		} else {
			lstBenefits = new ArrayList<>(0);
		}
		
		return lstBenefits;
	}

}
