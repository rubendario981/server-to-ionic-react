package com.example.serverspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverspringboot.entities.Supplier;
import com.example.serverspringboot.services.ISupplierService;
import com.example.serverspringboot.services.SupplierService;

@RestController
public class SupplierController implements ISupplierService {
    @Autowired
    private SupplierService service;

    @Override
    @GetMapping("api/supplier")
    public List<Supplier> getAll() {
        return service.getAll();
    }

    @Override
    @GetMapping("api/supplier/{id}")
    public Supplier getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Override
    @DeleteMapping("api/supplier/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);        
    }

    @Override
    @PostMapping("api/supplier/")
    public void save(@RequestBody Supplier s) {
        service.save(s);
    }
}
