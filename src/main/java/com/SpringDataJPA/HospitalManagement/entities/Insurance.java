package com.SpringDataJPA.HospitalManagement.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;

    private String provider;

    private LocalDate validUntil;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "insurance")
    private Patient patient; //inverse side
}
