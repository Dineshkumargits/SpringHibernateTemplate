package com.adkdinesh.template.dao;

import com.adkdinesh.template.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO 
{
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}