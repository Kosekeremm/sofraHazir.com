package com.example.sofrahazir.Entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String address;
    private LocalDate dateOfBirth;
    private String identityNumber;
    private boolean dataProtectionConsent;
    private boolean privacyPolicy;
    private boolean sellerAgreement;
    @OneToOne
    private Restaurant restaurant; // Restaurant owned by the user
}
