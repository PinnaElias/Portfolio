package it.taskmanagerAPI.Task.Manager.API.entities;
import it.taskmanagerAPI.Task.Manager.API.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class User {

    private UUID id;
    private String username;
    private String email;
    @Enumerated
    private Role role;
}
