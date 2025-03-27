package it.taskmanagerAPI.Task.Manager.API.repositories;

import it.taskmanagerAPI.Task.Manager.API.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
