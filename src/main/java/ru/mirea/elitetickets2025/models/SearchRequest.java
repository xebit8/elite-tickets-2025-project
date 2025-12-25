package ru.mirea.elitetickets2025.models;

import lombok.Data;
import ru.mirea.elitetickets2025.models.enums.Restrictions;

import java.time.LocalDate;

@Data
public class SearchRequest {
    LocalDate date;
    String city;
    Restrictions ageRestriction;
}