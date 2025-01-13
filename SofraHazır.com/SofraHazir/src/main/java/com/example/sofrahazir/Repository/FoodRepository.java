package com.example.sofrahazir.Repository;

import com.example.sofrahazir.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
