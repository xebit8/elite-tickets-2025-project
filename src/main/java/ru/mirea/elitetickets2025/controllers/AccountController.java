package ru.mirea.elitetickets2025.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mirea.elitetickets2025.dto.response.AccountResponse;
import ru.mirea.elitetickets2025.dto.request.RegistrationRequest;
import ru.mirea.elitetickets2025.models.AccountModel;
import ru.mirea.elitetickets2025.services.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @GetMapping("/{email}")
    public AccountModel getAccountByEmail(String email){
        return accountService.findAccountByEmail(email);
    }

    @PostMapping
    public AccountResponse registerAccount(@RequestBody RegistrationRequest request){
        AccountModel accountModel = accountService.registerAccount(request.getEmail(), request.getPassword(), request.getRole());

        return new AccountResponse(accountModel.getId(), accountModel.getEmail());
    }

}
