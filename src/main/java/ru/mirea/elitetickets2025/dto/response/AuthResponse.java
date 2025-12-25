package ru.mirea.elitetickets2025.dto.response;

import lombok.Data;

@Data
public class AuthResponse {
    String token;
    long expiresIn;
}
