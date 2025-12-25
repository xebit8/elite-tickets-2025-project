package ru.mirea.elitetickets2025.services;

import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.models.enums.Roles;

import java.util.UUID;

public interface AccountService {

    AccountModel registerAccount(String email, String password, Roles role);

    String loginAccount(AccountModel accountModel);

    AccountModel findAccountByEmail(String email);

    UUID getAccountIdByEmail(String email);

}
