package com.SpringDataJPA.HospitalManagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime appointmentTime;

    private String reason;

    private String status;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Patient patient;  //owning side

    @ManyToOne
    private Doctor doctor;  //owning side
}
