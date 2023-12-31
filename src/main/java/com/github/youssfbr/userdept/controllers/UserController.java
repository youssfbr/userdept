package com.github.youssfbr.userdept.controllers;

import com.github.youssfbr.userdept.entities.User;
import com.github.youssfbr.userdept.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findAll(@PathVariable Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public User userCreate(@RequestBody User user) {
        return userService.userCreate(user);
    }

}
