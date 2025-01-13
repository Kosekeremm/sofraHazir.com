package com.example.sofrahazir.Service;

import com.example.sofrahazir.Entity.RestaurantRating;
import com.example.sofrahazir.Repository.RestaurantRatingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantRatingService {
    private final RestaurantRatingRepository restaurantRatingRepository;

    public RestaurantRatingService(RestaurantRatingRepository restaurantRatingRepository) {
        this.restaurantRatingRepository = restaurantRatingRepository;
    }

    public Optional<RestaurantRating> getRestaurantById(Long id) {
        return restaurantRatingRepository.findById(id);
    }

    public RestaurantRating createRestaurant(RestaurantRating restaurantRating) {
        return restaurantRatingRepository.save(restaurantRating);
    }
}
