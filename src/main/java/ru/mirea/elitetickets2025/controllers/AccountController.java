package ru.mirea.elitetickets2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mirea.elitetickets2025.dto.request.AuthRequest;
import ru.mirea.elitetickets2025.dto.response.AccountResponse;
import ru.mirea.elitetickets2025.dto.request.RegistrationRequest;
import ru.mirea.elitetickets2025.dto.response.AuthResponse;
import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.security.JwtService;
import ru.mirea.elitetickets2025.services.AccountService;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final JwtService jwtService;
    @GetMapping("/{email}")
    public AccountModel getAccountByEmail(@PathVariable String email){
        return accountService.findAccountByEmail(email);
    }

    @PostMapping("/register")
    public AccountResponse registerAccount(@RequestBody RegistrationRequest request){
        AccountModel accountModel = accountService.registerAccount(request.getEmail(), request.getPassword(), request.getRole());
        System.out.println(request.getEmail());
        System.out.println(request.getPassword());
        System.out.println(request.getRole());
        String accountEmail = accountModel.getEmail();
        UUID accountId = accountService.getAccountIdByEmail(accountEmail);

        return new AccountResponse(accountId, accountEmail);
    }

    @PostMapping("/login")
    public AuthResponse loginAccount(@RequestBody AuthRequest request) {
        String jwtToken = accountService.loginAccount(request.getEmail(), request.getPassword());
        long expirationTime = jwtService.getExpirationTime();

        return new AuthResponse(jwtToken, expirationTime);
    }

}
