package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception;

public class EmployeeAlreadyAddedException extends Exception {

    public EmployeeAlreadyAddedException() {
        super("Такой сотрудник уже числиться в штате");
    }

}
