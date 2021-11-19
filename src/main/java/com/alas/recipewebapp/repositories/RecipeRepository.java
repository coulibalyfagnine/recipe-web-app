package com.alas.recipewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alas.recipewebapp.domain.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
