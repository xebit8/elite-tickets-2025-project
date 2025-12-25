package ru.mirea.elitetickets2025.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.elitetickets2025.dao.AccountDao;
import ru.mirea.elitetickets2025.models.AccountModel;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;

    @Override
    public void registerAccount(String email, String password) {
        accountDao.addNewAccount(email, password);
    }

    @Override
    public String loginAccount(AccountModel accountModel) {
        AccountModel account = accountDao.findAccountByEmail(accountModel.getEmail());

        if(account.getPassword().equals(accountModel.getPassword())){
            return "JWT Token let gooooo";
        } else {
            return "No no mister fish";
        }
    }

    @Override
    public AccountModel findAccountByEmail(String email) {

        return accountDao.findAccountByEmail(email);
    }
}
