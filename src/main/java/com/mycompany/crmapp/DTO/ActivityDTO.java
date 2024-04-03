package com.mycompany.crmapp.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ActivityDTO {
    private Long id;
    private Long customerId;
    private String customerName;
    private String type; // e.g., email, call, meeting
    private LocalDateTime dateTime;
    private String notes;
}
