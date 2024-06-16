package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Entity.VaccineInfo;

public interface Repository extends JpaRepository<VaccineInfo, Integer> {
	
	

	
}
