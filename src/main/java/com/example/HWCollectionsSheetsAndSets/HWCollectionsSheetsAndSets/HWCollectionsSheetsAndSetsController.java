package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.model.Employee;
import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class HWCollectionsSheetsAndSetsController {

    private final EmployeeService employeeServiceimpl;

    public HWCollectionsSheetsAndSetsController(EmployeeService employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @GetMapping
    public String employeeList() {
        return employeeServiceimpl.employeeList();
    }

    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                              @RequestParam(value = "lastName", required = false) String lastName) {

        Employee employee = new Employee(firstName, lastName);
        try {
            employeeServiceimpl.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Сотрудник успешно добавлен. Информация: " + employee;
    }

    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                                 @RequestParam(value = "lastName", required = false) String lastName) throws Exception {
        Employee employee = new Employee(firstName, lastName);
        try {
            employeeServiceimpl.removeEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Сотрудник " + employee + " успешно удален";
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam(value = "firstName", required = false) String firstName,
                               @RequestParam(value = "lastName", required = false) String lastName) throws Exception {
        Employee employee = new Employee(firstName, lastName);
        try {
            employeeServiceimpl.findEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
          return "Найдено совпадение - " + employee;
    }

}
