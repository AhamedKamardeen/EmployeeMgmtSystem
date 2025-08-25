package com.aop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.entity.Employee;
import com.aop.service.EmployeeService;

import jakarta.persistence.EntityManager;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService emp) {
		this.employeeService=emp;
	}
	@GetMapping("/get-all-employee")
	public Map getAllEmployee(){
		Map response = new HashMap<>();
		List<Employee> employeeList = employeeService.getAllEmployee();
		response.put("employeeList", employeeList);
		return response;
	}
	@PostMapping("/save-emp")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) {
		Employee employee = employeeService.saveEmp(emp);
		return ResponseEntity.ok(employee);
	}

}
