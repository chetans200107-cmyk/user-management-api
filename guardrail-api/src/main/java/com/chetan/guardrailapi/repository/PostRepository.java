package com.chetan.guardrailapi.repository;

import com.chetan.guardrailapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}