package backend.controller;

import java.util.Collection;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import backend.model.*;
import backend.repository.*;

@Path("/v1/users/")
public class BrainController {
	
	@GET
	@Path("/{user_id}/jobs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJobsUser(@PathParam("user_id") String user_id) {
		
		
		HashMap<String, Job> jobs = JobRepository.getInstance().findJobsUser(user_id);	
		
		if (jobs.isEmpty()) {
			return Response.status(404).entity("{\"error\": \"NOT FOUND\"}").build();
		}
		return Response.ok(jobs.values()).build();
	}
}
