package com.gesoft.managerproject.repositories;

import java.util.List;

import com.gesoft.managerproject.model.Project;

public interface ProjectRepository {

	public List<Project> findAll();
	
	public Project findById(Integer id);
	
	public Project findByManagerId(Integer id);
	
	public Project findByDeveloperId(Integer id);
	
	
	
}
