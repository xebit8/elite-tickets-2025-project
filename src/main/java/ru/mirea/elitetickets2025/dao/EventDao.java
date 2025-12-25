package ru.mirea.elitetickets2025.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.elitetickets2025.mappers.EventMapper;
import ru.mirea.elitetickets2025.models.SearchResponse;
import ru.mirea.elitetickets2025.repositories.EventRepository;


@Component
@RequiredArgsConstructor
public class EventDao {

    private final EventRepository eventRepository;

    private final EventMapper eventMapper;

    public SearchResponse FilterEvents() {
        return new SearchResponse();
    }
}
