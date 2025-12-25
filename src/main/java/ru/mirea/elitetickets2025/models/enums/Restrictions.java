package ru.mirea.elitetickets2025.models.enums;

import lombok.Getter;

@Getter
public enum Restrictions {
    ANYONE("0"),
    YOUNG("12"),
    TEEN("14"),
    ADULT("18");

    private final String ageNumber;

    Restrictions(String ageNumber) {
        this.ageNumber = ageNumber;
    }
}
