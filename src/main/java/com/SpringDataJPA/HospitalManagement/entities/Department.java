package com.SpringDataJPA.HospitalManagement.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @OneToOne
    @JoinColumn(nullable = false)
    private Doctor headDoctor;   //each department will have one head-doctor

    @ManyToMany
    private List<Doctor> doctors;   // each department will have many doctors,
                                    // and each doctor can be part of multiple
                                    // department (ManyToMany)
}
