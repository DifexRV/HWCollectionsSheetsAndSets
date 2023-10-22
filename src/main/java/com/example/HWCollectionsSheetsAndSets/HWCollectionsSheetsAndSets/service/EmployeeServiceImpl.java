package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeAlreadyAddedException;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeStorageIsFullException;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;
import org.springframework.stereotype.Service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeNotFoundException;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(List.of());

    @Override
    public Collection<Employee> employeeList() {
        return Collections.unmodifiableList(employees);
    }

    @Override
    public Employee addEmployee(Employee employee) throws Exception {
        if (employees.size() >= 13) {
            throw new EmployeeStorageIsFullException();
        }

        if (employees.contains(employee) == true) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employees.add(employee);
        }
        return employee;
    }

    @Override
    public Employee removeEmployee(Employee employee) throws Exception {

        if (employees.contains(employee) == false) {
            throw new EmployeeNotFoundException();
        } else {
            Iterator<Employee> employeeIterator = employees.iterator();
            while (employeeIterator.hasNext()) {
                Employee nextEmployee = employeeIterator.next();
                if (nextEmployee.equals(employee) != true) {
                    employeeIterator.remove();
                }
            }
        }
        return employee;
    }

    @Override
    public Employee findEmployee(Employee employee) throws Exception {

        if (employees.contains(employee) == false) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

}
