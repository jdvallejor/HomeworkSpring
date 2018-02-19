package com.homeworkspring.example.config;

import com.homeworkspring.example.document.User;
import com.homeworkspring.example.repository.UserRepository;
import com.homeworkspring.example.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = {UserRepository.class, NoteRepository.class})
@Configuration
public class MongoDBConfig {

    //@Bean
    //CommandLineRunner commandLineRunner(UserRepository userRepository, NoteRepository noteRepository) {
    //    return new CommandLineRunner(){
    //        @Override
    //        public void run(String... strings) throws Exception{
    //            userRepository.save(new User("Default-User"));
    //        }
    //    };
    //}

}
