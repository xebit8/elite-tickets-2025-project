package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.mirea.elitetickets2025.entities.Customer;
import ru.mirea.elitetickets2025.models.CustomerModel;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
    Customer modelToEntity(CustomerModel customerModel);

    CustomerModel entityToModel(Customer customer);
}