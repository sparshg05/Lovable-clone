package com.example.springProjects.Lovable_clone.dto.member;

import com.example.springProjects.Lovable_clone.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role
) {
}
