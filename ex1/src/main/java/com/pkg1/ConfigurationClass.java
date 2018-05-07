package com.pkg1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.dao.Employee;

@Configuration
public class ConfigurationClass {
	@Bean
	@Scope("prototype")
	public Employee getEmployeeObject() {
		return new Employee();
	}
}
