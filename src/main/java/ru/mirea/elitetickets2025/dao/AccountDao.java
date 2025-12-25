package ru.mirea.elitetickets2025.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.elitetickets2025.entities.Account;
import ru.mirea.elitetickets2025.mappers.AccountMapper;
import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.repositories.AccountRepository;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AccountDao {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    public UUID getAccountIdByEmail(String email){
        Account account = accountRepository.findByEmail(email);
        return account.getId();
    }

    public AccountModel findAccountByEmail(String email) {
        Account account = accountRepository.findByEmail(email);

        return accountMapper.entityToModel(account);
    }

    public AccountModel addNewAccount(String email, String password){
        Account account = new Account();
        account.setEmail(email);
        account.setPassword(password);

        return accountMapper.entityToModel(accountRepository.save(account));
    }
}
