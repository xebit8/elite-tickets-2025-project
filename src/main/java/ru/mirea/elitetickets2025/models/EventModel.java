package ru.mirea.elitetickets2025.models;

import ru.mirea.elitetickets2025.models.enums.Restrictions;

import java.time.LocalDateTime;

public class EventModel {
    String title;
    String description;
    LocalDateTime start_time;
    LocalDateTime end_time;
    Restrictions age_restriction;
    boolean document_required;
    int ticket_limit;
}
