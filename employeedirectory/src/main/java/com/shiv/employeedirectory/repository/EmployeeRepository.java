package com.shiv.employeedirectory.repository;

import com.shiv.employeedirectory.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No need to write any code here — Spring JPA does it for us!
}
