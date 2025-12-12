package com.example.springProjects.Lovable_clone.service.impl;

import com.example.springProjects.Lovable_clone.dto.project.FileContentResponse;
import com.example.springProjects.Lovable_clone.dto.project.FileNode;
import com.example.springProjects.Lovable_clone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long id, Long userId) {
        return null;
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
