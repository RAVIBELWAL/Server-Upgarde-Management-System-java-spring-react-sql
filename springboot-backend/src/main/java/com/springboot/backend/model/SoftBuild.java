package com.springboot.backend.model;

import javax.persistence.*;

@Entity
@Table(name ="softwares")
public class SoftBuild {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Soft_name")
	private String name;
	
	@Column(name="version")
	private String version;

	@Column(name="release_d")
	private String release_d;
	
	@Column(name="details")
	private String details;
	
	
	public SoftBuild() {}


	public SoftBuild(long id, String name, String version, String release_d, String details) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.release_d = release_d;
		this.details = details;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getRelease_d() {
		return release_d;
	}


	public void setRelease_d(String release_d) {
		this.release_d = release_d;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}
	
}
