package ru.mirea.elitetickets2025.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TierInfoDto {
    Integer tierId;
    String tierTitle;
    Integer price;
    String tierDesc;
}