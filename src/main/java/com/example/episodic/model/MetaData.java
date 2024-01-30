package com.example.episodic.model;

// MetaData.java
import javax.persistence.*;

@Entity
public class MetaData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String notes;
    // Getters and setters
}