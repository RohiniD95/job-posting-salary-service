package com.vendorsystem.jobpostingsalaryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendorsystem.jobpostingsalaryservice.resource.Salary;
import com.vendorsystem.jobpostingsalaryservice.service.SalaryService;

@RestController
@RequestMapping("/salary")
public class SalaryController {

	@Autowired
	public SalaryService service;
	
	@RequestMapping("/{salaryId}")
	public Salary getSalary(@PathVariable("salaryId")String salaryId) {
		
		Salary salary = service.getSalary(salaryId);
		
		return salary;
	}
}
