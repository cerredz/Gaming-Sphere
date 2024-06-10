package com.gamingsphere.Server.models;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private User user;
    private Group group;
    private List<Reply> replies;
    private List<String> tags;
    @CreatedDate
    private LocalDateTime createdAt;    
}
