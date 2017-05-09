package com.gesoft.managerproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gesoft.managerproject.model.Project;
import com.gesoft.managerproject.repositories.ProjectRepository;

@Service
public class ProjectService {

	private ProjectRepository projectRepository;

	@Autowired
	public void setProjectRepository(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	public List<Project> findAll(){
		return projectRepository.findAll();
		
	}
	
	
}
