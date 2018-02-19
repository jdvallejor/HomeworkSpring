package com.homeworkspring.example.repository;

import com.homeworkspring.example.document.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
