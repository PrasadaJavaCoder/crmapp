package com.mycompany.crmapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crmapp.Entities.Contract;
@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    

}
