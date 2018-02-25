package com.homeworkspring.example.controller;

import com.homeworkspring.example.document.Note;
import com.homeworkspring.example.document.User;
import com.homeworkspring.example.repository.NoteRepository;
import com.homeworkspring.example.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;
    private NoteRepository noteRepository;

    public UserController(UserRepository userRepository, NoteRepository noteRepository) {
        this.userRepository = userRepository;
        this.noteRepository = noteRepository;
    }

    @GetMapping("/")
    public List<User> getAll(){
        return this.userRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody User user){
        this.userRepository.save(user);
    }

    @PutMapping
    public void update(@RequestBody User user){
        this.userRepository.insert(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        List<Note> notes = this.noteRepository.findAllByUserId(id);
        for (Note note: notes){
            this.noteRepository.delete(note.getId());
        }
        this.userRepository.delete(id);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") String id){
        User user = this.userRepository.findById(id);
        return user;
    }

}
