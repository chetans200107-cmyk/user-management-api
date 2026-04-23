package com.chetan.guardrailapi.controller;

import com.chetan.guardrailapi.dto.PostDTO;
import com.chetan.guardrailapi.entity.Post;
import com.chetan.guardrailapi.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // ✅ CREATE
    @PostMapping
    public PostDTO createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    // ✅ GET ALL
    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postService.getAllPosts();
    }

    // ✅ GET BY ID
    @GetMapping("/{id}")
    public PostDTO getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }
}