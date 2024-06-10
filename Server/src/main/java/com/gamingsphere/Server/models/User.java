package com.gamingsphere.Server.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private String bio;
    private List<Group> groups;
    private List<Post> posts;
    private List<String> games;

    // Constructor
    public User(String id, String username, String email, String password, String profilePicture, String bio) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.groups = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.games = new ArrayList<>();
    }
    // Constructor
    public User(String id, String username, String email, String password, String profilePicture, String bio, List<String> games) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.groups = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.games = games;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getBio() {
        return bio;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<String> getGames() {
        return games;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }


    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

}
