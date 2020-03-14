package com.example.orginzation.department.mapper;

import com.example.orginzation.department.entity.DepartmentEntity;
import com.example.orginzation.department.model.Department;

public class DepartmentMapper {

	public static Department entityToModel(DepartmentEntity departmentEntity) {
		Department departmentModel = new Department();
		departmentModel.setDepartmentId(departmentEntity.getDepartmentId());
		departmentModel.setDepartmentHead(departmentEntity.getDepartmentHead());
		departmentModel.setDepartmentCountry(departmentEntity.getDepartmentCountry());
		departmentModel.setDepartmentName(departmentEntity.getDepartmentName());
		return departmentModel;
	}
}
