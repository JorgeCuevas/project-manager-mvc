package com.gesoft.managerproject.model;

import java.util.Date;
import java.util.List;

public class Project {

	private Integer id;
	private String descripcion;
	private Date start;
	private Boolean open;
	private Integer managerId;
	private List<Developer> developers;
	
	
	
	public Project(Integer id, String descripcion, Date start, Boolean open, Integer managerId,
			List<Developer> developers) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.start = start;
		this.open = open;
		this.managerId = managerId;
		this.developers = developers;
	}
	
	public Project(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	
	
	
}
