package com.gangadhararao.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.gangadhararao.entity.Signup;

@Repository
public class DefaultSignupRepository implements SignupRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Long createRegister(Signup signup) {
		entityManager.persist(signup);
		return signup.getId();
	}

}
