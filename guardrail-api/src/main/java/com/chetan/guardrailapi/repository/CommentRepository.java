package com.chetan.guardrailapi.repository;

import com.chetan.guardrailapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}