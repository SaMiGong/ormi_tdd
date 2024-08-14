package com.example.tddtest2.service;

import com.example.tddtest2.entity.User;

public interface UserService {
    User registerUser(String email, String password, String name);
    User getUserByEmail(String email);
    User updateUser(String email, String name);
    void deleteUser(String email);
    boolean isEmailTaken(String email);
}