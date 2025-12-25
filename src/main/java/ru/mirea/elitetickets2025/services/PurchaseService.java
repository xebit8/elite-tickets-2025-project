package ru.mirea.elitetickets2025.services;

import ru.mirea.elitetickets2025.models.PurchaseRequest;
import ru.mirea.elitetickets2025.models.PurchaseResponse;

public interface PurchaseService {
    PurchaseResponse PurchaseTicket(PurchaseRequest request);
}
