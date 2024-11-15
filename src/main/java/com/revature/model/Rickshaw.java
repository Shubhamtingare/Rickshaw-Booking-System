package com.revature.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rickshaws")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rickshaw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String vehicleType; // e.g., standard, deluxe
    private String location;
    private BigDecimal fare;
    private boolean availability;
    private int rating;
}

