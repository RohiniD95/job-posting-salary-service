package com.vendorsystem.jobpostingsalaryservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vendorsystem.jobpostingsalaryservice.resource.Salary;

public class SalaryService {

	@Autowired
	public Salary salary;
	
	public Salary getSalary(String salaryId) {
		if (salaryId.equals(salaryId)) {
			salary.setSalaryId(salaryId);
			salary.setMinSalary("3L");
			salary.setMaxSalary("10L");
			salary.setJptId("Z1254308657");
		}
		return salary;
	}

}
