package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "event_address")
@NoArgsConstructor
@AllArgsConstructor
public class EventAddressEntity {

    @Id
    Integer id;

    @Column(name = "address_name", length = 255)
    String addressName;

    String city;

    String street;

    String building;

    String floor;

    String room;
}
