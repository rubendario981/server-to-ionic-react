package com.example.serverspringboot.services;

import java.util.List;

import com.example.serverspringboot.entities.Employee;

public interface IEmployeeService {
    void save(Employee e);
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
}
