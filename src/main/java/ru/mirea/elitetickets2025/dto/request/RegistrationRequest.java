package ru.mirea.elitetickets2025.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mirea.elitetickets2025.models.enums.Roles;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    String email;
    String password;
    Roles role; // VOLONTEER/USER/ADMIN, По умолчанию передаём USER
}
