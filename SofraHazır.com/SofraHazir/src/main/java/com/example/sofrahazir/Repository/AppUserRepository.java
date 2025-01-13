package com.example.sofrahazir.Repository;

import com.example.sofrahazir.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByEmail(String email); // Find user by email
}
