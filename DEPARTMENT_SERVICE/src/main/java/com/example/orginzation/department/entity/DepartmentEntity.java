package com.example.orginzation.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentEntity {

	@Id
	@Column(name = "DEPT_ID")
	private int departmentId;
	@Column(name = "DEPT_NAME")
	private String departmentName;
	@Column(name = "DEPT_HEAD")
	private String departmentHead;
	@Column(name = "DEPT_COUNTRY")
	private String departmentCountry;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	public String getDepartmentCountry() {
		return departmentCountry;
	}

	public void setDepartmentCountry(String departmentCountry) {
		this.departmentCountry = departmentCountry;
	}

}
