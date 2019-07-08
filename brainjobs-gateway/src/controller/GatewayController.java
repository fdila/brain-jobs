package controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/users/")
public class GatewayController {

	private static final String baseUrl = "http://localhost:8080/brainjobs-backend/api/v1/users/";
	Client client = ClientBuilder.newClient();
	WebTarget webTarget = client.target(baseUrl);

	@GET
	@Path("/{user_id}/jobs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJobsUser(@PathParam("user_id") String user_id) {
		String jobsUrl = user_id + "/jobs";
		WebTarget jobWebTarget = webTarget.path(jobsUrl);
		Invocation.Builder invocationBuilder = jobWebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		return response;

	}

	@GET
	@Path("/{user_id}/jobs/{job_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJobDetail(@PathParam("user_id") String user_id, @PathParam("job_id") String job_id) {
		String jobsUrl = user_id + "/jobs/" + job_id ;
		WebTarget jobWebTarget = webTarget.path(jobsUrl);
		Invocation.Builder invocationBuilder = jobWebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		return response;

	}

	@POST
	@Path("/{user_id}/jobs/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addJob(@PathParam("user_id") String user_id, Object json) {
		String jobsUrl = user_id + "/jobs" ;
		WebTarget jobWebTarget = webTarget.path(jobsUrl);
		Invocation.Builder invocationBuilder = jobWebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(json, MediaType.APPLICATION_JSON));
		return response;

	}

}
