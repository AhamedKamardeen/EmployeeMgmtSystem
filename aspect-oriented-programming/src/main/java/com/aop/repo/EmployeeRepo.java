package com.aop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aop.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
