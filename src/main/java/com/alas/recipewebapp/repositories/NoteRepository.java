package com.alas.recipewebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alas.recipewebapp.domain.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
