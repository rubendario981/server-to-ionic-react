package com.example.serverspringboot.services;

import java.util.List;

import com.example.serverspringboot.entities.Supplier;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier s);

}
