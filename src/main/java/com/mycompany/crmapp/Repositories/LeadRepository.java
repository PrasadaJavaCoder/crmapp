package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    
}
