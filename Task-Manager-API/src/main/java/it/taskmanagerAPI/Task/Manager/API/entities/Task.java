package it.taskmanagerAPI.Task.Manager.API.entities;

import it.taskmanagerAPI.Task.Manager.API.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;
}
