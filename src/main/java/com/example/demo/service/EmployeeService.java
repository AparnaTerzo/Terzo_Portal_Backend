package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.models.Employee;

import com.example.demo.models.Leaves;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> findAllEmployees();

    List<EmployeeDto> searchEmployees(String query);
    void updateEmployee(EmployeeDto employee);

    EmployeeDto findEmployeeById(Long employeeId);

    void delete(Long employeeId);
    int getAvailabledays(String type);

}