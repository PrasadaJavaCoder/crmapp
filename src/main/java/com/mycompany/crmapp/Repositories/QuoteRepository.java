package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Quote;
@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
    
}
