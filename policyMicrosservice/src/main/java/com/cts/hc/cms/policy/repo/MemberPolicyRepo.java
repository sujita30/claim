package com.cts.hc.cms.policy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.hc.cms.policy.entity.MemberPolicy;

public interface MemberPolicyRepo extends JpaRepository<MemberPolicy, Long>{

	public MemberPolicy findByPolicyIdAndMemberId(long policyId, long memberId);
}
