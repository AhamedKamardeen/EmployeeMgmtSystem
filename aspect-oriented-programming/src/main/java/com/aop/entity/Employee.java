package com.aop.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private long empId;
	@JsonProperty("empName")
	private String empName;
	@JsonProperty("age")
	private long age;
	@JsonProperty("gender")
	private String gender;
	
}
