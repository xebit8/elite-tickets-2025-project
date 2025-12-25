package ru.mirea.elitetickets2025.models;

import lombok.Builder;
import lombok.Value;

import java.time.Instant;
import java.util.List;

@Value
@Builder
public class EventDto {
    Integer eventId;
    String title;
    Instant startTime;
    String addressName;
    List<TierInfoDto> tiers;
}
