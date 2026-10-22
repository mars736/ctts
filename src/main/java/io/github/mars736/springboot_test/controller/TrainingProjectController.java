package io.github.mars736.springboot_test.controller;

import io.github.mars736.springboot_test.common.Result;
import io.github.mars736.springboot_test.entity.TrainingProject;
import io.github.mars736.springboot_test.service.TrainingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainingProject")
public class TrainingProjectController {
    @Autowired
    private TrainingProjectService trainingProjectService;

    @PostMapping
    public Result<Integer> createProject(@RequestBody TrainingProject project) {
        int num;
        if(((num=trainingProjectService.createProject(project)) )> 0)
        {
            return Result.success(num);
        }
        return Result.error("Failed to create project");
    }

    @DeleteMapping("/{id}")
    public Result<Integer> deleteProject(@PathVariable Integer id) {
        int num = trainingProjectService.deleteProject(id);
        if(num > 0) {
            return Result.success(num);
        }
        return Result.error("Failed to delete project");
    }

    @PutMapping
    public Result<Integer> updateProject(@RequestBody TrainingProject project) {
        int num = trainingProjectService.updateProject(project);
        if(num > 0) {
            return Result.success(num);
        }
        return Result.error("Failed to update project");
    }

    @GetMapping("/{id}")
    public Result<TrainingProject> getProjectById(@PathVariable Integer id) {
        TrainingProject project = trainingProjectService.getProjectById(id);
        if(project != null) {
            return Result.success(project);
        }
        return Result.error("Project not found");
    }

    @GetMapping
    public Result<List<TrainingProject>> getAllProjects() {
        List<TrainingProject> projects = trainingProjectService.getAllProjects();
        if(projects == null ) {
            return Result.error("No projects found");
        }
        return Result.success(projects);
    }
}
