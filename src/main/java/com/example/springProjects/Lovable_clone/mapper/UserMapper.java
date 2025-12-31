package com.example.springProjects.Lovable_clone.mapper;

import com.example.springProjects.Lovable_clone.dto.auth.SignupRequest;
import com.example.springProjects.Lovable_clone.dto.auth.UserProfileResponse;
import com.example.springProjects.Lovable_clone.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest request);

    UserProfileResponse toUserProfileResponse(User user);
}
