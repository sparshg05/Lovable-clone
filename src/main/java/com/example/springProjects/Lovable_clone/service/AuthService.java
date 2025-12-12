package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.auth.AuthResponse;
import com.example.springProjects.Lovable_clone.dto.auth.LoginRequest;
import com.example.springProjects.Lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
