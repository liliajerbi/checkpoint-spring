package com.example.checkpoint4.recipeCheckpoint.repository;

import com.example.checkpoint4.recipeCheckpoint.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
