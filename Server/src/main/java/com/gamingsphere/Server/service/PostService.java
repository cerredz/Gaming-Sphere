package com.gamingsphere.Server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gamingsphere.Server.models.Post;
import com.gamingsphere.Server.models.User;
import com.gamingsphere.Server.respositories.PostRepository;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post) {
        postRepository.insert(post);
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    } 

    public Optional<Post> getPostById(String id) {
        return postRepository.findById(id);
    }

    public void updatePost(Post post, String id) {
        Post savedPost = postRepository.findById(id)
                                      .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Post By ID %s", id)));
    
        savedPost.setUser(post.getUser());
        savedPost.setGroup(post.getGroup());
        savedPost.setDescription(post.getDescription());
        savedPost.setReplies(post.getReplies());
        savedPost.setCreatedAt(post.getCreatedAt());
        savedPost.setTags(post.getTags());
        postRepository.save(savedPost);
    }

    public void deletePost(String id) {
        postRepository.deleteById(id);
    }
    

}
