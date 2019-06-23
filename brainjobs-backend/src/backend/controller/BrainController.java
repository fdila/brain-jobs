package backend.controller;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	
	@GET
	@Path("/jobs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJobsUser() {

		HashMap<String, Job> jobs = JobRepository.getInstance().findAll();
		return Response.ok(jobs.values()).build();
	}

	@POST
	@Path("/{user_id}/jobs")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addJob(Job newJob, @PathParam("user_id") String user_id, @Context UriInfo uriInfo) {

		JobRepository.getInstance().save(newJob);

		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(newJob.getJob_id());

		return Response.created(builder.build()).build();
	}

	@GET
	@Path("/{user_id}/jobs/{job_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJobsUser(@PathParam("user_id") String user_id, @PathParam("job_id") String job_id) {

		HashMap<String, Job> jobs = JobRepository.getInstance().findJobsUser(user_id);
		Job job = jobs.get(job_id);

		if (job == null) {
			return Response.status(404).entity("{\"error\": \"NOT FOUND\"}" + job_id).build();
		}

		return Response.ok(job).build();
	}

}
