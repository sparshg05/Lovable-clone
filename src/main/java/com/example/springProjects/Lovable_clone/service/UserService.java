package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    @Nullable UserProfileResponse getProfile(Long userId);
}
