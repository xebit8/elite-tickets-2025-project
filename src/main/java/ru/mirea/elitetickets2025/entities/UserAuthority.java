package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_authority")
public class UserAuthority {
    @EmbeddedId
    private UserAuthorityId id;
}