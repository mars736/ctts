package io.github.mars736.springboot_test.service.impl;

import io.github.mars736.springboot_test.entity.TrainingProject;
import io.github.mars736.springboot_test.mappers.TrainingProjectMapper;
import io.github.mars736.springboot_test.service.TrainingProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingProjectServiceImpl implements TrainingProjectService {

    @Autowired
    private TrainingProjectMapper TrainingProjectMapper;
    @Override
    public TrainingProject getProjectById(Integer id) {
        return TrainingProjectMapper.selectById(id);
    }

    @Override
    public List<TrainingProject> getAllProjects() {
        return TrainingProjectMapper.selectList(null);
    }

    @Override
    public int createProject(TrainingProject project) {
        return TrainingProjectMapper.insert(project);
    }

    @Override
    public int updateProject(TrainingProject project) {
        return TrainingProjectMapper.updateById(project);
    }

    @Override
    public int deleteProject(Integer id) {
        return TrainingProjectMapper.deleteById(id);
    }
}
