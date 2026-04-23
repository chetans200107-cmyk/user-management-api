package com.chetan.guardrailapi.service;

import com.chetan.guardrailapi.dto.CommentDTO;
import com.chetan.guardrailapi.entity.Comment;
import java.util.List;

public interface CommentService {

    CommentDTO createComment(Comment comment);

    List<CommentDTO> getAllComments();

    CommentDTO getCommentById(Long id);
}