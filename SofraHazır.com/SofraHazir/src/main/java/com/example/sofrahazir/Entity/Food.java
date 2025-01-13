package com.example.sofrahazir.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private String photo;
    private String type; // Example: Soup, Main Course

    @ManyToOne
    private Menu menu; // Food belongs to a menu
}
