package ru.mirea.elitetickets2025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.elitetickets2025.entities.Ticket;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}