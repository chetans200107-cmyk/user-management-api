package com.chetan.guardrailapi.dto;

public class CommentDTO {   // ✅ CLASS (not interface)

    private Long id;
    private String content;
    private Long userId;
    private Long postId;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for content
    public String getContent() {
        return content;
    }

    // Setter for content
    public void setContent(String content) {
        this.content = content;
    }

    // Getter for userId
    public Long getUserId() {
        return userId;
    }

    // Setter for userId
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // Getter for postId
    public Long getPostId() {
        return postId;
    }

    // Setter for postId
    public void setPostId(Long postId) {
        this.postId = postId;
    }
}