package com.example.springProjects.Lovable_clone.service;

public interface FileService() {
    List<FileNode> getFileTree(Long id, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
