package it.taskmanagerAPI.Task.Manager.API.repositories;

import it.taskmanagerAPI.Task.Manager.API.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    Optional<Task> findByTitle(String title);
}
