package com.aop.service;

import java.util.List;

import com.aop.entity.Employee;

public interface EmployeeService {

	Employee saveEmp(Employee emp);

	List<Employee> getAllEmployee();

}
