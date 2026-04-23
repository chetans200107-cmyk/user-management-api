package com.chetan.guardrailapi.service;

import com.chetan.guardrailapi.dto.UserDTO;
import com.chetan.guardrailapi.entity.User;
import com.chetan.guardrailapi.exception.ResourceNotFoundException;
import com.chetan.guardrailapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ✅ CREATE USER
    @Override
    public UserDTO createUser(UserDTO userDTO) {

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPremium(userDTO.isPremium());

        User savedUser = userRepository.save(user);

        return mapToDTO(savedUser);
    }

    // ✅ GET ALL USERS
    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .toList();
    }

    // ✅ GET USER BY ID
    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + id)
                );

        return mapToDTO(user);
    }

    // ✅ UPDATE USER
    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {

        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + id)
                );

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPremium(userDTO.isPremium());

        User updatedUser = userRepository.save(user);

        return mapToDTO(updatedUser);
    }

    // ✅ DELETE USER
    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }

    // 🔁 ENTITY → DTO MAPPING
    private UserDTO mapToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.isPremium()
        );
    }
}