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

    @GetMapping("/")
    public List<Note> getAll(){
        return this.noteRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Note note){
        this.noteRepository.save(note);
    }

    @PutMapping
    public void update(@RequestBody Note note){
        this.noteRepository.insert(note);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.noteRepository.delete(id);
    }

    @GetMapping("/{id}")
    public Note getById(@PathVariable("id") String id){
        Note note = this.noteRepository.findById(id);
        return note;
    }

    @GetMapping("/findByUserId/{id}")
    public List<Note> getByUserId(@PathVariable String id){
        List<Note> notes = this.noteRepository.findAllByUserId(id);
        return notes;
    }

    @DeleteMapping("/deleteByUserId/{id}")
    public void deleteByUserId(String id){
        this.noteRepository.deleteByUserId(id);
    }

}
