package com.aberkane.micro_service_user.service;

import com.aberkane.micro_service_user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    Optional<User> updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}
