package com.aop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.entity.Employee;
import com.aop.repo.EmployeeRepo;
import com.aop.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		this.employeeRepo = empRepo;
	}

	@Override
	public Employee saveEmp(Employee emp) {
		return employeeRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

}
