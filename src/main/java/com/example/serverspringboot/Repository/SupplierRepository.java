package com.example.serverspringboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.serverspringboot.entities.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
    
}
