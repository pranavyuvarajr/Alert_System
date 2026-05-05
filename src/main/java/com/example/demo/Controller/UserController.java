package com.example.demo.Controller;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public Users userRegister(@RequestBody Users users) {
        return userService.userRegister(users);
    }

    @GetMapping("/{id}")
    public Users getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }
}
