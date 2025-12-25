package ru.mirea.elitetickets2025.dto.response;

import lombok.Value;

import java.util.UUID;

@Value
public class AccountResponse {
    UUID accountId;
    String email;
}
