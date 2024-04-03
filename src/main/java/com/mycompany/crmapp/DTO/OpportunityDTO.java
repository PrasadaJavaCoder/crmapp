package com.mycompany.crmapp.DTO;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OpportunityDTO {
    private Long id;
    private Long customerId;
    private String customerName;
    private String description;
    private BigDecimal amount;
    private String stage;
}
