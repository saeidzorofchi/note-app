package com.zorofchi.notes.simplenotesapp.repository;

import com.zorofchi.notes.simplenotesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Note , Long> {
}
