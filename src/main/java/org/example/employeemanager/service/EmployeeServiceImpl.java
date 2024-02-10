package org.example.employeemanager.service;

import lombok.RequiredArgsConstructor;
import org.example.employeemanager.exception.UserNotFoundException;
import org.example.employeemanager.model.Employee;
import org.example.employeemanager.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepo;

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        employeeRepo.findById(employee.getId())
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + employee.getId()));

        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        employeeRepo.deleteById(id);
    }
}
