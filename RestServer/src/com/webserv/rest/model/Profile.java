package com.webserv.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private long id;
	private String firstName;
	private String lname;
	
	
	public Profile() {
		super();
	}
	
	

	public Profile(long id, String firstName, String lname) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lname = lname;
		
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	
}
