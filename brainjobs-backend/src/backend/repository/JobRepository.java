package backend.repository;
import backend.model.Job;
import backend.model.Job.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JobRepository {

	private Map<String, Job> jobs;

	private static JobRepository instance = null;

	public static JobRepository getInstance() {
		if (instance == null) {
			instance = new JobRepository();
		}
		return instance;
	}
	private JobRepository() {
		this.jobs = new HashMap<>();
		Date date = new Date();
		jobs.put("job1", new Job("pippo", "prova", Language.Cpp, Framework.Keras,
				"hey", Datatype.csv, "job1", date, Status.created));
		jobs.put("job2", new Job("pippo", "prova", Language.Cpp, Framework.Keras,
				"hey", Datatype.csv, "job2", date, Status.created));
		jobs.put("job3", new Job("pippo", "prova", Language.Cpp, 
				"hey", Datatype.csv, "job3", date, Status.created));
	}

	public HashMap<String, Job> findAll() {
		return (HashMap<String, Job>) this.jobs;
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
