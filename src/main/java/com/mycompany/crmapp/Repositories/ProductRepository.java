package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
