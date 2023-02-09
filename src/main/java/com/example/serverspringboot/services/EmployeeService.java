package com.example.serverspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serverspringboot.Repository.EmployeeRepository;
import com.example.serverspringboot.entities.Employee;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repository;
    
    @Override
    public List<Employee> getAll(){
        return (List<Employee>) repository.findAll();
    }
    
    @Override
    public Employee getById(Long id){
        return (Employee) repository.findById(id).get();
    }
    
    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }
    
    @Override
    public void save(Employee e){
        repository.save(e);
    }
}
