package com.example.niit.KUROBOTWebService.repository;

import com.example.niit.KUROBOTWebService.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
