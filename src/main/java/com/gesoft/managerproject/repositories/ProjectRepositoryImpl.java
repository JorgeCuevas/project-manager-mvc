package com.gesoft.managerproject.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.gesoft.managerproject.model.Developer;
import com.gesoft.managerproject.model.Project;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

	private List<Project> projects;
	private List<Developer> developers;

	
	public ProjectRepositoryImpl(List<Project> projects, List<Developer> developers) {
		super();
		this.projects = projects;
		this.developers = developers;
	}

	public ProjectRepositoryImpl() {
		super();
	
	}


	@PostConstruct
	public void init() {
		
		this.developers = new ArrayList<>(Arrays.asList(new Developer(1, "Jorge", "Cuevas", "Full Stack",
				new ArrayList<>(Arrays.asList("Java", "Java EE", "JSF", "PrimeFaces", "SASS", "CSS", "JavaScript",
						"Nodejs", "Spring", "Spring MVC", "Spring Data", "Spring AOP", "ExpressJs", "AngularJs",
						"MongoDB", "REST API", "Jersey"))),

				new Developer(2, "Merlin", "Moya", "Full Stack", new ArrayList<>(Arrays.asList("C#", "Xamarin", "CSS",
						"JavaScript", "FireBase", "REST API", "Jersey", "Mobile", "SQL Server", "ASP .Net"))),

				new Developer(3, "Juan", "Martinez", "FrontEnd", new ArrayList<>(Arrays.asList("CSS", "JavaScript",
						"FireBase", "React", "AngularJS", "VueJs", "Web Pack", "Glup")))

		));

		this.projects = new ArrayList<>(
				Arrays.asList(new Project(1, "Projecto Control Equipo ", new Date(), true, 2, developers),
						new Project(2, "Estadistica Manager", new Date(), true, 4, developers),
						new Project(3, "Cloud", new Date(), true, 3, developers)));

	}

	

	@Override
	public List<Project> findAll() {
		return this.projects;
	}



	@Override
	public Project findById(Integer id) {
		
		return getById(id);
	}



	@Override
	public Project findByManagerId(Integer id) {
			return getByManagerId(id);
	}



	@Override
	public Project findByDeveloperId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Project getById(Integer id){
		return this.projects.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.get();
	}


	public Project getByManagerId(Integer id){
		return this.projects.stream()
		.filter(p -> p.getManagerId() == id)
		.findFirst()
		.get();
	}


	




}
