package com.example.serverspringboot.services;

import java.util.List;

import com.example.serverspringboot.entities.Customer;

public interface ICostumerService {
    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
