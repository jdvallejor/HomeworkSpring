package com.homeworkspring.example.controller;

import com.homeworkspring.example.document.Note;
import com.homeworkspring.example.repository.NoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    private NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public List<Note> getAll(){
        return this.noteRepository.findAll();
    }

}
