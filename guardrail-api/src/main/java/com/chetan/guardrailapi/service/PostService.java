package com.chetan.guardrailapi.service;

import com.chetan.guardrailapi.dto.PostDTO;
import com.chetan.guardrailapi.entity.Post;

import java.util.List;

public interface PostService {

    PostDTO createPost(Post post);

    List<PostDTO> getAllPosts();

    PostDTO getPostById(Long id);
}