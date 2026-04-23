package com.chetan.guardrailapi.controller;

import com.chetan.guardrailapi.dto.UserDTO;
import com.chetan.guardrailapi.exception.ApiResponse;
import com.chetan.guardrailapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping
    public ApiResponse<UserDTO> createUser(@Valid @RequestBody UserDTO userDTO) {
        return new ApiResponse<>(200, userService.createUser(userDTO));
    }

    // GET ALL
    @GetMapping
    public ApiResponse<List<UserDTO>> getAllUsers() {
        return new ApiResponse<>(200, userService.getAllUsers());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ApiResponse<UserDTO> getUserById(@PathVariable Long id) {
        return new ApiResponse<>(200, userService.getUserById(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ApiResponse<UserDTO> updateUser(@PathVariable Long id,
                                           @Valid @RequestBody UserDTO userDTO) {
        return new ApiResponse<>(200, userService.updateUser(id, userDTO));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ApiResponse<>(200, "User deleted successfully");
    }
}