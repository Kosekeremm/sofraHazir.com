package com.example.sofrahazir.Controller;

import com.example.sofrahazir.Entity.AppUser;
import com.example.sofrahazir.Service.AppUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appUsers")
public class AppUserController {
    private final AppUserService userService;

    public AppUserController(AppUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppUser> getAppUserById(@PathVariable Long id) {
        return userService.getAppUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AppUser> createAppUser(@RequestBody AppUser user) {
        return ResponseEntity.ok(userService.createAppUser(user));
    }

    @GetMapping
    public ResponseEntity<List<AppUser>> getAllAppUsers() {
        return userService.getAllAppUsers();
    }
}
