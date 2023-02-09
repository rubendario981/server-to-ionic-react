package com.example.serverspringboot.Repository;

import com.example.serverspringboot.entities.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

    default List<Customer> getAll(){
        return (List<Customer>) findAll();
    }

	Optional<Customer> findById(Long id);
    
}
