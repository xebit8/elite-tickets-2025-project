package ru.mirea.elitetickets2025.dto.request;

import ru.mirea.elitetickets2025.models.enums.Gender;

import java.time.LocalDate;

public class CustomerUpdateRequest {
    String lastName;
    String firstName;
    LocalDate birthday;
    Gender gender;
}
