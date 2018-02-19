package com.homeworkspring.example.repository;

import com.homeworkspring.example.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
