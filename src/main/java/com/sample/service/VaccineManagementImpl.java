package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Entity.VaccineInfo;
import com.sample.dao.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
@Service
public class VaccineManagementImpl implements VaccineManagement {
	
	@Autowired
	Repository repo;

	@Override
	public List<VaccineInfo> getVaccineInfoByGivenData(boolean status, VaccineInfo vaccine, String... properties) {
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC,properties);
		Example example = Example.of(vaccine);
		
		return repo.findAll(example, sort);
	}

	@Override
	public List<VaccineInfo> getVaccineInfoByGivenObject(VaccineInfo vaccine) {
		
		Example example = Example.of(vaccine);
		return repo.findAll(example);
	}

	@Override
	public VaccineInfo searchVaccineById(Integer id) {
		return repo.getReferenceById(id);
	}

	@Override
	public String removeVaccineByIds(Iterable<Integer> ids) {
		List<VaccineInfo> list = repo.findAllById(ids);
		Integer count = list.size();
		if(count!=0) {
			repo.deleteAllByIdInBatch(ids);
			return "Records deleted";
		}
		return "Records not found";
		
		
		
	}

	
	
	


}
