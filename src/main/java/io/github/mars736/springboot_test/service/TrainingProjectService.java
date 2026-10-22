package io.github.mars736.springboot_test.service;

import io.github.mars736.springboot_test.entity.TrainingProject;

import java.util.List;

public interface TrainingProjectService {
    public TrainingProject getProjectById(Integer id);
    public List<TrainingProject> getAllProjects();
    public int createProject(TrainingProject project);
    public int updateProject(TrainingProject project);
    public int deleteProject(Integer id);
}
