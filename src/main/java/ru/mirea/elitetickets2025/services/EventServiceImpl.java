package ru.mirea.elitetickets2025.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.elitetickets2025.dao.EventDao;
import ru.mirea.elitetickets2025.models.SearchRequest;
import ru.mirea.elitetickets2025.models.SearchResponse;
import ru.mirea.elitetickets2025.models.enums.Restrictions;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventDao eventDao;

    @Override
    public SearchResponse SearchEvents(SearchRequest request) {
        Instant now = Instant.now();
        String city = request.getCity();
        LocalDate searchDate = request.getDate();
        Restrictions ageRestriction = request.getAgeRestriction();

        var events = eventDao.FilterEvents(date, city, ageRestriction);

        return events;
    }
}
