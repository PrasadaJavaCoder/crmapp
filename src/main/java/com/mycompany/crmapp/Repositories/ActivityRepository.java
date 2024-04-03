package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Activity;
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    
}
