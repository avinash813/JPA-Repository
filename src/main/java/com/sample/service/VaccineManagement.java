package com.sample.service;

import java.util.List;

import com.sample.Entity.VaccineInfo;

public interface VaccineManagement {
	
	public List<VaccineInfo> getVaccineInfoByGivenData(boolean status, VaccineInfo vaccine,String... properties );
	public List<VaccineInfo> getVaccineInfoByGivenObject(VaccineInfo vaccine);
	public VaccineInfo searchVaccineById(Integer id);
	public String removeVaccineByIds(Iterable<Integer> ids);
	

}
