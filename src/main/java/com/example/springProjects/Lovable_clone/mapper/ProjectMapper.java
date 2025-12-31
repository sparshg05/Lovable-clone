package com.example.springProjects.Lovable_clone.mapper;

import com.example.springProjects.Lovable_clone.dto.project.ProjectResponse;
import com.example.springProjects.Lovable_clone.dto.project.ProjectSummaryResponse;
import com.example.springProjects.Lovable_clone.entities.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
