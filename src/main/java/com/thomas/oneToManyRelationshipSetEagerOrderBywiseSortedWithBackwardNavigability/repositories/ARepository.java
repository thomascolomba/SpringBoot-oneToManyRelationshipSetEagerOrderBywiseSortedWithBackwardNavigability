package com.thomas.oneToManyRelationshipSetEagerOrderBywiseSortedWithBackwardNavigability.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thomas.oneToManyRelationshipSetEagerOrderBywiseSortedWithBackwardNavigability.domains.A;

public interface ARepository extends CrudRepository<A, Long> {
	public List<A> findByA(String a);
}