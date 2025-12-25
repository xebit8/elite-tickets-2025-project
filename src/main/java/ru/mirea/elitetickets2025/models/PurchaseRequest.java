package ru.mirea.elitetickets2025.models;

import lombok.Data;

@Data
public class PurchaseRequest {
    Integer eventId;
    Integer tierId;
    int quantity;
}