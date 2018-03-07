package com.homeworkspring.example.controller;

import com.homeworkspring.example.document.Note;
import com.homeworkspring.example.document.User;
import com.homeworkspring.example.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    private NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getAll(){
        return this.noteRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Note note){
        this.noteRepository.save(note);
    }

    @PutMapping
    public void update(@RequestBody Note note){
        this.noteRepository.save(note);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.noteRepository.delete(id);
    }

    @GetMapping("/{id}")
    public Note getById(@PathVariable("id") String id){
        return this.noteRepository.findById(id);
    }

    @GetMapping("/findByUser/{id}")
    public List<Note> getByUser(@PathVariable String id){
        return this.noteRepository.findAllByUser(id);
    }

    @DeleteMapping("/deleteByUser/{id}")
    public void deleteByUser(@PathVariable String id){
        this.noteRepository.deleteAllByUser(id);
    }

}
