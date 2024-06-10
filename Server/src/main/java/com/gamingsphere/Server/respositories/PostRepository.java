package com.gamingsphere.Server.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gamingsphere.Server.models.Post;

public interface PostRepository extends MongoRepository<Post, String> {
}
