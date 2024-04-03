package com.mycompany.crmapp.DTO;

import lombok.Data;

@Data
public class LeadDTO {
    private Long id;
    private String companyName;
    private String contactPerson;
    private String email;
    private String phone;
    private String leadStatus;
}
