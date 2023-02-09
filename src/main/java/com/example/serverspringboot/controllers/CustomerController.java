package com.example.serverspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverspringboot.entities.Customer;
import com.example.serverspringboot.services.ICostumerService;

@RestController
public class CustomerController {
    @Autowired
    private ICostumerService service;

    @GetMapping("/api/customer")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/api/customer/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);        
    }

    @PostMapping("/api/customer")
    public void save(@RequestBody Customer customer) {
        service.save(customer);
        
    }
}
