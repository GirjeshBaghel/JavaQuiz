package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
