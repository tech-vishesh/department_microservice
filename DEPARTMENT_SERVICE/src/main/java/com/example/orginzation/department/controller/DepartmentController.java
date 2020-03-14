package com.example.orginzation.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.orginzation.department.model.Department;
import com.example.orginzation.department.service.DepartmentService;

@RestController
public class DepartmentController {

	@SuppressWarnings("rawtypes")
	@Autowired
	public DepartmentService deprtmentService;
	
	@GetMapping("/department/{id}")
	public Department one(@PathVariable int id) {

		return deprtmentService.getDepartment(id);
	}
}
