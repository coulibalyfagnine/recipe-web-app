package com.alas.recipewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alas.recipewebapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {

}
