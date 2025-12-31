package com.example.springProjects.Lovable_clone.dto.member;

import com.example.springProjects.Lovable_clone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
