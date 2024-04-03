package com.mycompany.crmapp.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class QuoteDTO {
    private Long id;
    private Long customerId;
    private String customerName;
    private Long productId;
    private String productName;
    private BigDecimal price;
    private LocalDateTime validUntil;
}
