package com.cts.hc.cms.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.hc.cms.policy.model.Benefits;
import com.cts.hc.cms.policy.model.ProviderModel;
import com.cts.hc.cms.policy.service.PolicyService;

@RestController
public class PolicyController {

//	getChainOfProviders
//	getEligibleBenefits
//	getEligibleClaimAmount

	@Autowired
	private PolicyService policyService;

	@GetMapping("/getChainOfProviders/{policyId}")
	public ResponseEntity<List<ProviderModel>> getProviders(@PathVariable("policyId") long policyId) {
		List<ProviderModel> providersByLocation = policyService.getProvidersByLocation(policyId);

		return providersByLocation != null ? new ResponseEntity<List<ProviderModel>>(providersByLocation, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/getEligibleBenefits/{policyId}/{memberId}")
	public ResponseEntity<List<Benefits>> getBenefits(@PathVariable("policyId") long policyId,
			@PathVariable("memberId") long memberId) {
		List<Benefits> benefits = policyService.getBenefitsByPolicyIdMemberId(policyId, memberId);

		return benefits != null ? new ResponseEntity<List<Benefits>>(benefits, HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
