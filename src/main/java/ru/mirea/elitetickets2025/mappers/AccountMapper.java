package ru.mirea.elitetickets2025.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.mirea.elitetickets2025.entities.Account;
import ru.mirea.elitetickets2025.models.AccountModel;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountMapper {
    AccountModel entityToModel(Account account);

    Account modelToEntity(AccountModel accountModel);
}
