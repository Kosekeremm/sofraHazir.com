package com.example.sofrahazir.Entity;

import com.example.sofrahazir.Entity.Enum.KitchenEnum;
import com.example.sofrahazir.Entity.Enum.RestaurantTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String city;
    private String district;
    private String address;
    private String photo;
    private RestaurantTypeEnum restaurantType; // Home Cooked or Chain
    private KitchenEnum kitchen; // fastFood or food
    private Long appUserId;

    @ManyToOne
    private RestaurantRating restaurantRating; // Restaurant rating

    @ManyToOne
    private Menu menu; // Menu of the restaurant
}
