package ru.mirea.elitetickets2025.dto.response;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponse {
    UUID accountId;
    String email;
}
