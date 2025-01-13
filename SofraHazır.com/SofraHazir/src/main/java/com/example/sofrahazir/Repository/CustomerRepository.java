package com.example.sofrahazir.Repository;

import com.example.sofrahazir.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
