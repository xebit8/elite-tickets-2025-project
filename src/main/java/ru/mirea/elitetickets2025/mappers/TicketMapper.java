package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.mirea.elitetickets2025.entities.Ticket;
import ru.mirea.elitetickets2025.models.TicketModel;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketMapper {
    // TODO Сделать и импортировать модель
    TicketModel entityToModel(Ticket ticket);

    Ticket modelToEntity(TicketModel ticketModel);
}
