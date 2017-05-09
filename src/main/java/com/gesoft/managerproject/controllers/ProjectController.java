package com.gesoft.managerproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gesoft.managerproject.model.Project;
import com.gesoft.managerproject.services.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	private ProjectService projectServ;
	
	
	@Autowired
	public void setProjectServ(ProjectService projectServ) {
		this.projectServ = projectServ;
	}


	@RequestMapping(value="/")
	public String allProjects(){
		return "projects";
	}
	
	
	@ModelAttribute("projects")
	public List<Project> projects(){
		return this.projectServ.findAll();
		
	}
	
}
