package com.gamingsphere.Server.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gamingsphere.Server.models.User;

public interface UserRepository extends MongoRepository<User, String> {
}
