package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Opportunity;

@Repository
public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
    
}
