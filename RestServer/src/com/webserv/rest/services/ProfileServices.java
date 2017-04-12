package com.webserv.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.webserv.rest.db.DatabaseClass;
import com.webserv.rest.model.Profile;

public class ProfileServices {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfile();
	
	
	
	public ProfileServices() {
		profiles.put("User_1", new Profile(1L, "User_1", "Miron"));
		profiles.put("User_2", new Profile(2L, "User_2", "Aloc"));
		profiles.put("User_3", new Profile(3L, "User_3", "Morcov"));
	}

	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getFirstName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getId() <= 0){
			return null;
		}
		
		profiles.put(profile.getFirstName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
}
