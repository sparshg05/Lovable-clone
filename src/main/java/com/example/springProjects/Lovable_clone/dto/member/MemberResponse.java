package com.example.springProjects.Lovable_clone.dto.member;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String password,

) {
}
