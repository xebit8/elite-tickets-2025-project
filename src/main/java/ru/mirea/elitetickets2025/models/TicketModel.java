package ru.mirea.elitetickets2025.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketModel {
    private LocalDateTime redeemed_by;
    private int price;
    boolean is_redeem;
}
