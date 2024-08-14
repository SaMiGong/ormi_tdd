package com.example.tddtest2.service;

import com.example.tddtest2.entity.User;
import com.example.tddtest2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User registerUser(String email, String password, String name) {
        User user = new User(email, password, name);
        return userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User updateUser(String email, String name) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            user.setName(name);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(String email) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            userRepository.delete(user);
        }
    }

    @Override
    public boolean isEmailToken(String email) {
        return userRepository.existsByEmail(email);
    }
}