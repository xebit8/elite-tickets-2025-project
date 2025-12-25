package ru.mirea.elitetickets2025.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.elitetickets2025.mappers.EventMapper;
import ru.mirea.elitetickets2025.repositories.EventRepository;


@Component
@RequiredArgsConstructor
public class EventDao {

    private final EventRepository eventRepository;

    private final EventMapper eventMapper;

    // TODO создать модель, подключить ее в маппере и определить методы
    // ....
}
