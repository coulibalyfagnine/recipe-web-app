package com.alas.recipewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alas.recipewebapp.domain.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
