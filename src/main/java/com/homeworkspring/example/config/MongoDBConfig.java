package com.homeworkspring.example.config;

import com.homeworkspring.example.document.Note;
import com.homeworkspring.example.document.User;
import com.homeworkspring.example.repository.UserRepository;
import com.homeworkspring.example.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;

@EnableMongoRepositories(basePackageClasses = {UserRepository.class, NoteRepository.class})
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, NoteRepository noteRepository) {
        return new CommandLineRunner(){
            @Override
            public void run(String... strings) throws Exception{

                userRepository.deleteAll();
                noteRepository.deleteAll();

                String id1 = userRepository.save(new User("User1")).getId();
                String id2 = userRepository.save(new User("User2")).getId();
                String id3 = userRepository.save(new User("User3")).getId();
                String id4 = userRepository.save(new User("User4")).getId();

                noteRepository.save(new Note(new Date().toString(), id1, "Text1"));
                noteRepository.save(new Note(new Date().toString(), id1, "Text12"));
                noteRepository.save(new Note(new Date().toString(), id2, "Text2"));
                noteRepository.save(new Note(new Date().toString(), id3, "Text3"));
                noteRepository.save(new Note(new Date().toString(), id3, "Text32"));
                noteRepository.save(new Note(new Date().toString(), id4, "Text4"));

            }
        };
    }

}
