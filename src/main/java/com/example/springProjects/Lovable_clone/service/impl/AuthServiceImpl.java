package com.example.springProjects.Lovable_clone.service.impl;

import com.example.springProjects.Lovable_clone.dto.auth.AuthResponse;
import com.example.springProjects.Lovable_clone.dto.auth.LoginRequest;
import com.example.springProjects.Lovable_clone.dto.auth.SignupRequest;
import com.example.springProjects.Lovable_clone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
