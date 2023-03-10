package com.learn.service;

import com.learn.entities.Project;
import com.learn.exception.DuplicateProjectNameException;
import com.learn.exception.RecordNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    public List<Project> getAllprojects();

    public Project saveProject(Project project) throws DuplicateProjectNameException;

    public Project updateProject(int projectId, Project project) throws RecordNotFoundException;

    public void deleteProjectById(long projectId);

    public Optional<Project> getProjectById(long projectId);

    public List<Project> getDataByAnyInput(Project project);
}
