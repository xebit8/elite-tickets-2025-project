package ru.mirea.elitetickets2025.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Embeddable
public class UserAuthorityId implements Serializable {
    private static final long serialVersionUID = -7157361203171255996L;
    @Column(name = "account_id")
    private UUID accountId;

    @Column(name = "authority_id")
    private Integer authorityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserAuthorityId entity = (UserAuthorityId) o;
        return Objects.equals(this.accountId, entity.accountId) &&
                Objects.equals(this.authorityId, entity.authorityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, authorityId);
    }

}