package com.example.sofrahazir.Service;

import com.example.sofrahazir.Entity.Restaurant;
import com.example.sofrahazir.Entity.AppUser;
import com.example.sofrahazir.Repository.AppUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    private final AppUserRepository userRepository;
    private final RestaurantService restaurantService;

    public AppUserService(AppUserRepository userRepository, RestaurantService restaurantService) {
        this.userRepository = userRepository;
        this.restaurantService = restaurantService;
    }

    public AppUser createAppUser(AppUser user) {
        if (user.getRestaurant() != null) {
            user.getRestaurant().setAppUserId(user.getId());
            Restaurant restaurant = restaurantService.createRestaurant(user.getRestaurant());
            user.setRestaurant(restaurant);
        }
        return userRepository.save(user);
    }
    public Optional<AppUser> getAppUserById(Long id) {
        return userRepository.findById(id);
    }

    @GetMapping
    public ResponseEntity<List<AppUser>> getAllAppUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    public AppUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
