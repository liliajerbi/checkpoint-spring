package com.example.checkpoint4.recipeCheckpoint.controller;

import com.example.checkpoint4.recipeCheckpoint.model.User;
import com.example.checkpoint4.recipeCheckpoint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/signUp")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/signIn/{email}/{password}")
    public User signIn(@PathVariable String email, @PathVariable String password) {
        return userRepository.findUserByEmailIgnoreCaseAndPassword(email, password);
    }

    @GetMapping("/user/{userId}")
    public User readOneUser(@PathVariable Long userId) {
        return userRepository.findById(userId).get();
    }
}
