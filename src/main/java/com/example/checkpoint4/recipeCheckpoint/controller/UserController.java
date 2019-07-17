package com.example.checkpoint4.recipeCheckpoint.controller;


import com.example.checkpoint4.recipeCheckpoint.model.User;
import com.example.checkpoint4.recipeCheckpoint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/signUp")
    public User createUser (@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/user/signIn")
    public User signIn (@RequestBody User user) {
        return userRepository.findUserByEmailIgnoreCaseAndPassword(user.getEmail(), user.getPassword());
    }
}
