package ru.mirea.elitetickets2025.models;

import lombok.Data;

import java.util.List;

@Data
public class SearchResponse {
    List<EventDto> events;
}