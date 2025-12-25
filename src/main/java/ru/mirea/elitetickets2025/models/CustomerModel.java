package ru.mirea.elitetickets2025.models;

import lombok.Builder;
import lombok.Value;
import ru.mirea.elitetickets2025.entities.Customer;
import ru.mirea.elitetickets2025.models.enums.Gender;

import java.time.LocalDate;

/**
 * DTO for {@link Customer}
 */
@Value
@Builder
public class CustomerModel {
    String accountEmail;
    String lastName;
    String firstName;
    LocalDate birthday;
    Gender gender;
}