package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.mirea.elitetickets2025.entities.Event;
import ru.mirea.elitetickets2025.models.EventModel;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventMapper {
    EventModel entityToModel(Event event);

    Event modelToEntity(EventModel eventModel);
}
