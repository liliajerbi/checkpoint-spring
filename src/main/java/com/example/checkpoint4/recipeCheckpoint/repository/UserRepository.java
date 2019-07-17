package com.example.checkpoint4.recipeCheckpoint.repository;

import com.example.checkpoint4.recipeCheckpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmailIgnoreCaseAndPassword(String email, String password);
}
