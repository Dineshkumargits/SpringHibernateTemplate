package com.adkdinesh.template.service;

import com.adkdinesh.template.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeManager {
	public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}
