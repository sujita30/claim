package com.cts.hc.cms.policy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.hc.cms.policy.entity.Policy;

@Repository
public interface PolicyRepo extends JpaRepository<Policy, Long>{

	
}
