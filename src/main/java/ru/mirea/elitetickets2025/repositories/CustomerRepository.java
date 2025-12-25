package ru.mirea.elitetickets2025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.elitetickets2025.entities.Customer;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}