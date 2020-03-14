package com.example.orginzation.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orginzation.department.entity.DepartmentEntity;
import com.example.orginzation.department.mapper.DepartmentMapper;
import com.example.orginzation.department.model.Department;
import com.example.orginzation.department.repository.DepartmentRepository;

@Service
public class DepartmentService<employeeRepository> {

	@Autowired
	public DepartmentRepository departmentRepository;

	public Department getDepartment(int id) {
		Optional<DepartmentEntity> employeeEntity = departmentRepository.findById(new Integer(id));
		if (employeeEntity.isPresent()) {
			return DepartmentMapper.entityToModel(employeeEntity.get());
		} else {
			return new Department();
		}
	}

}
