package com.webserv.rest.db;

import java.util.HashMap;
import java.util.Map;

import com.webserv.rest.model.Profile;

public class DatabaseClass {
	
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<String, Profile> getProfile(){
		
		return profiles;
	}
}
