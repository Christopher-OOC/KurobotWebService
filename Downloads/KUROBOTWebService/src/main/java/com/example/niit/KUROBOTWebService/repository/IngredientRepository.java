package com.example.niit.KUROBOTWebService.repository;


import com.example.niit.KUROBOTWebService.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

    Ingredient findByName(String name);

}
