package com.gamingsphere.Server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gamingsphere.Server.models.User;
import com.gamingsphere.Server.respositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.insert(user);
    }

    public User getUserByID(String id) {
        User savedUser = userRepository.findById(id)
                                      .orElseThrow(() -> new RuntimeException(String.format("Cannot Find User By ID %s", id)));
        return savedUser;
    }

    public void updateUser(User user, String id) {
        User savedUser = userRepository.findById(id)
                                      .orElseThrow(() -> new RuntimeException(String.format("Cannot Find User By ID %s", id)));

        savedUser.setBio(user.getBio());
        savedUser.setEmail(user.getEmail());
        savedUser.setGroups(user.getGroups());
        savedUser.setPassword(user.getPassword());
        savedUser.setProfilePicture(user.getProfilePicture());
        savedUser.setUsername(user.getUsername());
        savedUser.setGroups(user.getGroups());
        savedUser.setPosts(user.getPosts());
        savedUser.setGames(user.getGames());
        userRepository.save(savedUser);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
