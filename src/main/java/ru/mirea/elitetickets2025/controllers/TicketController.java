package ru.mirea.elitetickets2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mirea.elitetickets2025.models.*;
import ru.mirea.elitetickets2025.services.EventService;
import ru.mirea.elitetickets2025.services.PurchaseService;

@RestController
@RequestMapping("/api/v1/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final EventService eventService;
    private final PurchaseService purchaseService;

    @GetMapping("/events")
    public ResponseEntity<SearchResponse> getEvents(SearchRequest request) {
        SearchResponse response = eventService.SearchEvents(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/purchase")
    public ResponseEntity<PurchaseResponse> purchaseTicket(PurchaseRequest request) {
        PurchaseResponse response = purchaseService.PurchaseTicket(request);

        return ResponseEntity.ok(response);
    }
}
