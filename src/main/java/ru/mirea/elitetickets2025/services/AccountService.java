package ru.mirea.elitetickets2025.services;

import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.models.enums.Roles;

public interface AccountService {

    void registerAccount(String email, String password, Roles role);

    String loginAccount(AccountModel accountModel);

    AccountModel findAccountByEmail(String email);

}
