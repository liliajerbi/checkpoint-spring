package com.example.checkpoint4.recipeCheckpoint.controller;

import com.example.checkpoint4.recipeCheckpoint.model.Recipe;
import com.example.checkpoint4.recipeCheckpoint.model.User;
import com.example.checkpoint4.recipeCheckpoint.repository.RecipeRepository;
import com.example.checkpoint4.recipeCheckpoint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @PostMapping("/user/{userId}/recipes")
    public Recipe createRecipe(@PathVariable Long userId,
                               @RequestBody Recipe recipe) {
        User user = userRepository.findById(userId).get();
        recipe.setUser(user);
        return recipeRepository.save(recipe);
    }

}
