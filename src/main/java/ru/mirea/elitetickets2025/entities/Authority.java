package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.mirea.elitetickets2025.models.enums.Roles;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Roles authority;
}