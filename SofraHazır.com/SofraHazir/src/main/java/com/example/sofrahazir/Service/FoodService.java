package com.example.sofrahazir.Service;

import com.example.sofrahazir.Entity.Food;
import com.example.sofrahazir.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Optional<Food> getCustomerById(Long id) {
        return foodRepository.findById(id);
    }

    public Food createCustomer(Food food) {
        return foodRepository.save(food);
    }
}
