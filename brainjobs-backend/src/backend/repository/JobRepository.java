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
		Job job1 = new Job("pippo", "titolo1", Language.R, Framework.Keras, "file1", Datatype.json, "print(ciao)");
		jobs.put(job1.getJob_id(), job1);
		
		Job job2 = new Job("pippo", "titolo2", Language.R, "file2", Datatype.csv, "print(ciao)");
		jobs.put(job2.getJob_id(), job2);
		
		Job job3 = new Job("pluto", "titolo3", Language.Python, Framework.Keras, "file3", Datatype.json, "print(ciao)");
		jobs.put(job3.getJob_id(), job3);
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
