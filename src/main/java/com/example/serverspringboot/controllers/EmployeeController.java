package com.example.serverspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverspringboot.entities.Employee;
import com.example.serverspringboot.services.EmployeeService;
import com.example.serverspringboot.services.IEmployeeService;

@RestController
public class EmployeeController implements IEmployeeService {
    @Autowired
    private EmployeeService service;

    @Override
    @PostMapping("/api/employee")
    public void save(@RequestBody Employee e) {
        service.save(e);
    }

    @Override
    @GetMapping("/api/employee")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @Override
    @GetMapping("/api/employee/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Override
    @DeleteMapping("/api/employee/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);
        
    }
    
}
