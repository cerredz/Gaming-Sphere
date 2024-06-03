package com.gamingsphere.Server.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gamingsphere.Server.models.Group;

public interface GroupRepository extends MongoRepository<Group, String>{
    
}
