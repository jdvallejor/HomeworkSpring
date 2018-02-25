package com.homeworkspring.example.repository;

import com.homeworkspring.example.document.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NoteRepository extends MongoRepository<Note, String> {

    Note findById(String id);
    List<Note> findAllByUserId(String id);
    void deleteByUserId(String id);

}
