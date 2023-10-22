package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;

public interface EmployeeService {

    String employeeList();
    void addEmployee(Employee employee) throws Exception;

    void removeEmployee(Employee employee) throws Exception;

    void findEmployee(Employee employee) throws Exception;

}
