package ru.mirea.elitetickets2025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.elitetickets2025.entities.Account;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    Account findByEmail(String email);
}
