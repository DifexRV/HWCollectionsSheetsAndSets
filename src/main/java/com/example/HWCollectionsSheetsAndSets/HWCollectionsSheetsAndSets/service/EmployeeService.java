package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> employeeList();
    Employee addEmployee(Employee employee) throws Exception;

    Employee removeEmployee(Employee employee) throws Exception;

    Employee findEmployee(Employee employee) throws Exception;

}
