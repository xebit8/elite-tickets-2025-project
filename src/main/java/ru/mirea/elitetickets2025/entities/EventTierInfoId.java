package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EventTierInfoId implements Serializable {
    private static final long serialVersionUID = 804354820912118996L;
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "ticket_tier_id")
    private Integer ticketTierId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EventTierInfoId entity = (EventTierInfoId) o;
        return Objects.equals(this.eventId, entity.eventId) &&
                Objects.equals(this.ticketTierId, entity.ticketTierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, ticketTierId);
    }

}