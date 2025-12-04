package com.example.springProjects.Lovable_clone.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
