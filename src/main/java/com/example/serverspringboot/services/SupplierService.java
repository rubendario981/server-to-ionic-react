package com.example.serverspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serverspringboot.Repository.SupplierRepository;
import com.example.serverspringboot.entities.Supplier;

@Service
public class SupplierService implements ISupplierService {
    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAll() {
        return (List<Supplier>) repository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Supplier s) {
        repository.save(s);       
    }

}
