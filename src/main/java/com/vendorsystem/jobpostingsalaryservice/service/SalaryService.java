package com.vendorsystem.jobpostingsalaryservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vendorsystem.jobpostingsalaryservice.resource.Salary;

public class SalaryService {

	@Autowired
	public Salary salary;
	
	public Salary getSalary(String jptId) {
		if (jptId.equals(jptId)) {
			salary.setSalaryId("Z10233");
			salary.setMinSalary("3L");
			salary.setMaxSalary("10L");
			salary.setJptId(jptId);
		}
		return salary;
	}

}
