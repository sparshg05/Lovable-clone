package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.auth.AuthResponse;
import com.example.springProjects.Lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(SignupRequest request);
}
