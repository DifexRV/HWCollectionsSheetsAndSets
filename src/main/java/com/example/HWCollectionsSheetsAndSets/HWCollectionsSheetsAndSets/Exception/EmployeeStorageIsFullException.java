package com.example.HWCollectionsSheetsAndSets.HWCollectionsSheetsAndSets.Exception;

public class EmployeeStorageIsFullException extends Exception {

    public EmployeeStorageIsFullException() {
        super("Количество сотрудников достигло максимального размера. Невозможно добавить нового сотрудника");
    }

}
