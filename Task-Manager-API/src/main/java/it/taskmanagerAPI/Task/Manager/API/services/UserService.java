package it.taskmanagerAPI.Task.Manager.API.services;

import it.taskmanagerAPI.Task.Manager.API.entities.User;
import it.taskmanagerAPI.Task.Manager.API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Page<User> returnAllUsers(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return userRepo.findAll(pageable);
    }

    public User retrieveUserById(UUID userID) {
        return userRepo.findById(userID)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userID));
    }

    public User retrieveUserByUsername(String username){
        return userRepo.findByUsername(username)
                .orElseThrow(()-> new RuntimeException("User not found with username: " + username));
    }

}
