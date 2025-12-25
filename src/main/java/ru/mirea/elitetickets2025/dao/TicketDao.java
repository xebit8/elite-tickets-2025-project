package ru.mirea.elitetickets2025.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.elitetickets2025.mappers.TicketMapper;
import ru.mirea.elitetickets2025.repositories.TicketRepository;


@Component
@RequiredArgsConstructor
public class TicketDao {

    private final TicketRepository ticketRepository;

    private final TicketMapper ticketMapper;

    // TODO создать модель, подключить ее в маппере и определить методы
    // ....
}
