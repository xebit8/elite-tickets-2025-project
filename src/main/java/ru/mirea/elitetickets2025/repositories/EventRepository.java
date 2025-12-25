package ru.mirea.elitetickets2025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mirea.elitetickets2025.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
}