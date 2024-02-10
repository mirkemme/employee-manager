package org.example.employeemanager.service;

import org.example.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    Employee findEmployeeById(Long id);
    void deleteEmployee(Long id);
}
