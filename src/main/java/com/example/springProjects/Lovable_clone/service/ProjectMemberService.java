package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.member.InviteMemberRequest;
import com.example.springProjects.Lovable_clone.dto.member.MemberResponse;
import org.jspecify.annotations.Nullable;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
}
