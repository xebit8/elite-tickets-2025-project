package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.mirea.elitetickets2025.models.enums.Roles;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @Column(name = "account_id", nullable = false)
    private UUID id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Enumerated(EnumType.STRING)
    private Roles role;
}