package backend.repository;
import backend.model.Job;
import backend.model.Job.*;

import java.util.HashMap;
import java.util.Map;

public class JobRepository {

	private HashMap<String, Job> jobs;

	private static JobRepository instance = null;

	public static JobRepository getInstance() {
		if (instance == null) {
			instance = new JobRepository();
		}
		return instance;
	}
	private JobRepository() {
		this.jobs = new HashMap<>();
		Job job = new Job("pippo", "titolo", Language.Cpp, Framework.Caffe, "dataset", Datatype.json, "sadaaee");
		jobs.put(job.getJob_id(), job);
	}

	public HashMap<String, Job> findAll() {
		return this.jobs;
	}

	
	public HashMap<String, Job> findJobsUser(String user_id) {
		HashMap <String, Job> userJobs = new HashMap<String, Job>();
		for (Map.Entry<String, Job> job : jobs.entrySet()) {
			if (job.getValue().getUser_id().equals(user_id)) {
				userJobs.put(job.getKey(), job.getValue());
			}
		}
		return userJobs;
	}

	public void save(Job job) {
		this.jobs.put(job.getJob_id(), job);
	}

}
