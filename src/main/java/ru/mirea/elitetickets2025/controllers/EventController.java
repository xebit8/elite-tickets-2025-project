package ru.mirea.elitetickets2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.elitetickets2025.models.SearchRequest;
import ru.mirea.elitetickets2025.models.SearchResponse;
import ru.mirea.elitetickets2025.models.enums.Restrictions;
import ru.mirea.elitetickets2025.services.EventService;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/search")
    public ResponseEntity<SearchResponse> searchEventsGet(
            @RequestParam(required = false) LocalDate date,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) Restrictions ageRestriction) {

        SearchRequest request = new SearchRequest();
        request.setDate(date);
        request.setCity(city);
        request.setAgeRestriction(ageRestriction);

        SearchResponse response = eventService.SearchEvents(request);
        return ResponseEntity.ok(response);
    }
}
