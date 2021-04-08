package com.vendorsystem.jobpostingsalaryservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vendorsystem.jobpostingsalaryservice.resource.Salary;
import com.vendorsystem.jobpostingsalaryservice.service.SalaryService;

@Configuration
public class BeanConfiguration {

	@Bean
	public Salary getSalary() {
		return new Salary();
	}
	
	@Bean
	public SalaryService getSalaryService() {
		return new SalaryService();
	}
}
