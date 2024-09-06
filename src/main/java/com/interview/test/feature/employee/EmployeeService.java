package com.interview.test.feature.employee;

import com.interview.test.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return null;
    }

    public Employee getEmployeeById(Long id) {
        return null;
    }

    public Employee createEmployee(Employee employee) {
        return null;
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        return null;
    }

    public void deleteEmployee(Long id) {

    }
}
