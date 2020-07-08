package com.thomas.oneToManyRelationshipSetEagerOrderBywiseSortedWithBackwardNavigability.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thomas.oneToManyRelationshipSetEagerOrderBywiseSortedWithBackwardNavigability.domains.B;


public interface BRepository extends CrudRepository<B, Long> {
	List<B> findByB(String b);
}