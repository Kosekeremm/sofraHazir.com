package com.example.sofrahazir.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class RestaurantRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer; // Customer who rated

    private BigDecimal rating;

    private String description;
    @ManyToOne
    private Restaurant restaurant; // Restaurant being rated
}
