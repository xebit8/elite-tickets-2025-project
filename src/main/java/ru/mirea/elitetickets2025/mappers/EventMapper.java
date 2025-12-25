package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.mirea.elitetickets2025.entities.Event;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventMapper {
    // TODO Сделать и импортировать модель
    EventModel entityToModel(Event event);

    Event modelToEntity(EventModel eventModel);
}
