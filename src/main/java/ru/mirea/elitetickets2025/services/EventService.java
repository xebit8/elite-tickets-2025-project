package ru.mirea.elitetickets2025.services;

import ru.mirea.elitetickets2025.models.SearchRequest;
import ru.mirea.elitetickets2025.models.SearchResponse;

public interface EventService {
    SearchResponse SearchEvents(SearchRequest request);
}
