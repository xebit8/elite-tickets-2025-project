package ru.mirea.elitetickets2025.services;

import ru.mirea.elitetickets2025.models.AccountModel;

public interface AccountService {

    void registerAccount(String email, String password);

    String loginAccount(AccountModel accountModel);
}
