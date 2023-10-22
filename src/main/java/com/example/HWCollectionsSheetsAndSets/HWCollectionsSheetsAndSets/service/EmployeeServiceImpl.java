package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeAlreadyAddedException;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeStorageIsFullException;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;
import org.springframework.stereotype.Service;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Тролль", "Борис"),
            new Employee("Кранова", "Матильда"),
            new Employee("Бристоль", "Матеос"),
            new Employee("Врунишкин", "Аркадий"),
            new Employee("Медлеходов", "Бронислав"),
            new Employee("Наглышов", "Глав"),
            new Employee("Грустный", "Олег"),
            new Employee("Горгона", "Медуза"),
            new Employee("Привередов", "Виктор"),
            new Employee("Простофилин", "Иван")
    ));

    @Override
    public String employeeList() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append("</p>");
        }
        return sb.toString();
    }

    @Override
    public void addEmployee(Employee employee) throws Exception {
        if (employees.size() >= 13) {
            throw new EmployeeStorageIsFullException();
        }

        if (employees.contains(employee) == true) {
            throw new EmployeeAlreadyAddedException();

        } else {
            employees.add(employee);
        }

    }

    @Override
    public void removeEmployee(Employee employee) throws Exception {

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
    }

    @Override
    public void findEmployee(Employee employee) throws Exception {

        if (employees.contains(employee) == false) {
            throw new EmployeeNotFoundException();
        }


    }
}
