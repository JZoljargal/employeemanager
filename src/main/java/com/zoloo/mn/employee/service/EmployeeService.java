package com.zoloo.mn.employee.service;

import java.util.List;
import java.util.UUID;

import com.zoloo.mn.employee.model.Employee;
import com.zoloo.mn.employee.repository.EmployeeRepo;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) throws Exception {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) throws Exception {
        return employeeRepo.findById(id).orElseThrow(() -> new Exception("User by id " + id + " was not found"));
    }
}
