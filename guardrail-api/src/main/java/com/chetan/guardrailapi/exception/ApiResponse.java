package com.chetan.guardrailapi.exception;

import java.time.LocalDateTime;

public class ApiResponse<T> {

    private int status;
    private T data;
    private LocalDateTime timestamp;

    public ApiResponse(int status, T data) {
        this.status = status;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}