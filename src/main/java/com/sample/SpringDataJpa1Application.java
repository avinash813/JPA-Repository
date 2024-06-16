package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.Entity.VaccineInfo;
import com.sample.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineManagementImpl obj = context.getBean(VaccineManagementImpl.class);
		
//		VaccineInfo vaccine = new VaccineInfo();
//		vaccine.setPrice(13000);
//		System.out.println(obj.getVaccineInfoByGivenData(true, vaccine, "vaccineName"));
		

//		VaccineInfo vaccine1 = new VaccineInfo();
//		vaccine1.setPrice(13000);
//		vaccine1.setCountry("Germany");
//		System.out.println(obj.getVaccineInfoByGivenObject( vaccine1));
		
//		System.out.println(obj.searchVaccineById(7));
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(6);
		ids.add(7);
		obj.removeVaccineByIds(ids);
		
		
		
		context.close();

		
	}

}
