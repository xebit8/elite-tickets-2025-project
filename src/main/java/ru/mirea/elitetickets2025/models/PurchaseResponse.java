package ru.mirea.elitetickets2025.models;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class PurchaseResponse {
    UUID ticketId;
    String imageUrl;
    Instant purchaseTime;
}