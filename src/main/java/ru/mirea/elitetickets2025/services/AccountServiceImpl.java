package ru.mirea.elitetickets2025.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.elitetickets2025.dao.AccountDao;
import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.models.enums.Roles;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;

    @Override
    public AccountModel registerAccount(String email, String password, Roles role) {
        return accountDao.addNewAccount(email, password, role);
    }

    @Override
    public String loginAccount(AccountModel accountModel) {
        AccountModel account = accountDao.findAccountByEmail(accountModel.getEmail());

        // Надо реализовать JWT
        if(account.getPassword().equals(accountModel.getPassword())) {
            return "JWT Token let gooooo";
        } else {
            return "No no mister fish";
        }
    }

    @Override
    public AccountModel findAccountByEmail(String email) {

        return accountDao.findAccountByEmail(email);
    }

    @Override
    public UUID getAccountIdByEmail(String email){
        return accountDao.getAccountIdByEmail(email);
    }
}
