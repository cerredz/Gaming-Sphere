package com.gamingsphere.Server.models;

import org.springframework.data.annotation.Id;

public class Reply {
    @Id
    private String id;
    private User user;
    private String description;

    // Constructor
    public Reply(String id, User user, String description) {
        this.id = id;
        this.user = user;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
