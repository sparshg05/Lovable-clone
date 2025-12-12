package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.project.FileContentResponse;
import com.example.springProjects.Lovable_clone.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long id, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
