package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.mirea.elitetickets2025.models.enums.Restrictions;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private EventAddressEntity address;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Column(name = "document_required")
    private Boolean documentRequired;

    @Enumerated(EnumType.STRING)
    private Restrictions ageRestriction;
}