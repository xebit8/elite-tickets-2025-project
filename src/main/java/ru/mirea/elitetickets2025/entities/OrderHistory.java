package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.mirea.elitetickets2025.models.enums.OrderStatus;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "order_history")
public class OrderHistory {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @Column(name = "order_time")
    private Instant orderTime;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}