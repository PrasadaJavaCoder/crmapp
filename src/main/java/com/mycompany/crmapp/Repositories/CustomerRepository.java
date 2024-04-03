package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
