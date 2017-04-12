package com.webserv.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webserv.rest.model.Profile;
import com.webserv.rest.services.ProfileServices;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResources {
	
	private ProfileServices  profServ = new ProfileServices(); 
	
	@GET
	public List<Profile> getProfile(){
		return profServ.getAllProfiles();
	}
	
	@POST
	public Profile addProfile(Profile profile){
		return profServ.addProfile(profile);
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName){
		return profServ.getProfile(profileName);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
		profile.setFirstName(profileName);
		return profServ.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName){
		profServ.removeProfile(profileName);
	}
	
}
