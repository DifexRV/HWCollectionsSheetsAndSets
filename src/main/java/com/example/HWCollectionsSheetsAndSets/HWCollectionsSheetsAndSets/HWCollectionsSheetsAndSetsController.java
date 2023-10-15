package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets;

import com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWCollectionsSheetsAndSetsController {

    private final EmployeeService employeeServiceimpl;

    public HWCollectionsSheetsAndSetsController(EmployeeService employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }


    @GetMapping (path = "/add")
    public String addEmployee() {
        return null;
    }

    @GetMapping (path = "/remove")
    public String removeEmployee() {
        return null;
    }

    @GetMapping (path = "/find")
    public String findEmployee() {
        return null;
    }

}
