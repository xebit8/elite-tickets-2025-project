package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "event_tier_info")
public class EventTierInfo {
    @EmbeddedId
    private EventTierInfoId id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "tier_desc", length = Integer.MAX_VALUE)
    private String tierDesc;

}