package com.gesoft.managerproject.model;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

public class Developer {

	
	private Integer id;
	private String name;
	@NotBlank(message="You must provide a valid developer last name")
	private String lastName;
	private String type;
	private List<String> skills;
	 
	
	
	
	public Developer(Integer id, String name, String lastName, String type, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.type = type;
		this.skills = skills;
	}
	
	public Developer(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", lastName=" + lastName + ", skills=" + skills.toString() + "]";
	}
	
	
	
}
