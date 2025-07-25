package com.shiv.employeedirectory.service;

import com.shiv.employeedirectory.model.Employee;
import com.shiv.employeedirectory.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmp) {
        Employee existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedEmp.getName());
            existing.setEmail(updatedEmp.getEmail());
            existing.setDepartment(updatedEmp.getDepartment());
            return repository.save(existing);
        } else {
            return null;
        }
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
