package com.mycompany.crmapp.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContractDTO {
    private Long id;
    private Long customerId;
    private String customerName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
