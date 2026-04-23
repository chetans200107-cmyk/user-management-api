package com.chetan.guardrailapi.service;

import com.chetan.guardrailapi.dto.PostDTO;
import com.chetan.guardrailapi.entity.Post;
import com.chetan.guardrailapi.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // ✅ CREATE POST
    @Override
    public PostDTO createPost(Post post) {
        Post savedPost = postRepository.save(post);
        return mapToDTO(savedPost);
    }

    // ✅ GET ALL POSTS
    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    // ✅ GET POST BY ID
    @Override
    public PostDTO getPostById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        return mapToDTO(post);
    }

    // ✅ DTO MAPPING
    private PostDTO mapToDTO(Post post) {
        return new PostDTO(
                post.getId(),
                post.getContent(),
                post.getUser().getId()
        );
    }
}