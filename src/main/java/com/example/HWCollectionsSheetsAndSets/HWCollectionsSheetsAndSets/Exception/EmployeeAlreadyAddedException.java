package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedException extends Exception {

    public EmployeeAlreadyAddedException() {
        super("Такой сотрудник уже числиться в штате");
    }

}
