package ru.mirea.elitetickets2025.models;

import lombok.Builder;
import lombok.Value;
import ru.mirea.elitetickets2025.models.enums.Restrictions;

import java.time.LocalDateTime;
@Value
@Builder
public class EventModel {
    String title;
    String description;
    LocalDateTime start_time;
    LocalDateTime end_time;
    Restrictions age_restriction;
    boolean document_required;
    int ticket_limit;
}
