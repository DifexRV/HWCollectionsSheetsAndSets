package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class HWCollectionsSheetsAndSetsController {

    private final EmployeeService employeeServiceimpl;

    public HWCollectionsSheetsAndSetsController(EmployeeService employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @GetMapping
    public Collection<Employee> employeeList() {
        return employeeServiceimpl.employeeList();
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                              @RequestParam(value = "lastName", required = false) String lastName) throws Exception {

        Employee employee = new Employee(firstName, lastName);
        try {
           employeeServiceimpl.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }


    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                                 @RequestParam(value = "lastName", required = false) String lastName) throws Exception {
        Employee employee = new Employee(firstName, lastName);
        try {
            employeeServiceimpl.removeEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                               @RequestParam(value = "lastName", required = false) String lastName) throws Exception {
        Employee employee = new Employee(firstName, lastName);
        try {
            employeeServiceimpl.findEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
          return employee;
    }


}
