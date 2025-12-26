package ru.mirea.elitetickets2025.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ru.mirea.elitetickets2025.dao.AccountDao;
import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.models.enums.Roles;
import ru.mirea.elitetickets2025.repositories.AccountRepository;
import ru.mirea.elitetickets2025.security.JwtService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final AccountRepository accountRepository;

    @Override
    public AccountModel registerAccount(String email, String password, Roles role) {
        return accountDao.addNewAccount(email, password, role);
    }

    @Override
    public String loginAccount(String email, String password) {
        UserDetails user = (UserDetails) accountRepository.findByEmail(email);
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(email, password)
        );
        return jwtService.generateToken(user);
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
