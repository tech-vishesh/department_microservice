package com.example.orginzation.department.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.orginzation.department.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentEntity,Integer>{

}
