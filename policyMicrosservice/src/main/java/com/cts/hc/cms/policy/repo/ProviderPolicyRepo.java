package com.cts.hc.cms.policy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.hc.cms.policy.entity.ProviderPolicy;

public interface ProviderPolicyRepo extends JpaRepository<ProviderPolicy, Long>{

	public List<ProviderPolicy> findByPolicyId(long policyId);
}
