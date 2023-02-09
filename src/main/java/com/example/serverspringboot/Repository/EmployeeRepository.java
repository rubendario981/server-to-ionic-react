package com.example.serverspringboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.serverspringboot.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}
