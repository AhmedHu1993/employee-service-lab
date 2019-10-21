package com.codeclan.employeeservice;

import com.codeclan.employeeservice.models.Employee;
import com.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployees() {
//		Employee employee1 = new Employee("Ahmed", 26, 87465749, "hghdghsgf@codeclan.com");
		Employee employee2 = new Employee("Allan", 35, 87433749, "hghdwwwgf@codeclan.com");
		Employee employee3 = new Employee("Amanda", 30, 44465749, "eedghsgf@codeclan.com");
		Employee employee4 = new Employee("Alex", 32, 87335749, "eeehdghsgf@codeclan.com");
//		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
	}

}
