package com.alas.recipewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alas.recipewebapp.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
