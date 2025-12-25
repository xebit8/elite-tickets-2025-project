package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.mirea.elitetickets2025.entities.Customer;
import ru.mirea.elitetickets2025.models.CustomerModel;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
    @Mapping(source = "accountEmail", target = "account.email")
    Customer modelToEntity(CustomerModel customerModel);

    @Mapping(source = "account.email", target = "accountEmail")
    CustomerModel entityToModel(Customer customer);
}