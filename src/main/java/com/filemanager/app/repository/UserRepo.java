package com.filemanager.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.filemanager.app.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    User findByUsername(String username);
    User findByEmail(String email);

}
