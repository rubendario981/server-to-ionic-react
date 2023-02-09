package com.example.serverspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serverspringboot.Repository.CustomerRepository;
import com.example.serverspringboot.entities.Customer;

@Service
public class CustomerService implements ICostumerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll(){
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return (Customer)repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);        
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);        
    }
}
