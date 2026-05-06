package com.example.demo.Service;

import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public Users userRegister(Users users) {
        userRepository.save(users);
        return users;
    }

    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Users getUser(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
