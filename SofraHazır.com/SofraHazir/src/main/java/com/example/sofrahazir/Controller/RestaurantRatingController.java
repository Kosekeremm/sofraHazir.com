package com.example.sofrahazir.Controller;

import com.example.sofrahazir.Entity.RestaurantRating;
import com.example.sofrahazir.Repository.RestaurantRatingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant-ratings")
public class RestaurantRatingController {
    private final RestaurantRatingRepository restaurantRatingRepository;

    public RestaurantRatingController(RestaurantRatingRepository restaurantRatingRepository) {
        this.restaurantRatingRepository = restaurantRatingRepository;
    }

    @GetMapping
    public ResponseEntity<List<RestaurantRating>> getAllRatings() {
        return ResponseEntity.ok(restaurantRatingRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<RestaurantRating> createRating(@RequestBody RestaurantRating rating) {
        return ResponseEntity.ok(restaurantRatingRepository.save(rating));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable Long id) {
        if (restaurantRatingRepository.existsById(id)) {
            restaurantRatingRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
