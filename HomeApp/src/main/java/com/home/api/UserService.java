/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.api;

import com.home.model.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author rtongbram
 */

@Path("/user")
public class UserService {
    
    @GET
	@Path("/details")
    @Produces(MediaType.APPLICATION_JSON)
	public User getDetails() {
 
        User user = new User();
        user.setFirstName("Tom");
        user.setLastName("White");
		return user;
 
	}
    
    @GET
	@Path("/test/{param}")
	public Response getDetails(@PathParam("param") String msg) {
 
        int status = 403;
        String result = "{data = dummy}";
        if(msg!=null){
            result = "{data="+msg+"}";
            status = 200;
        }
        
		String output = "Jersey say : " + msg;
 
		return Response.status(status).entity(result).build();
 
	}
}
