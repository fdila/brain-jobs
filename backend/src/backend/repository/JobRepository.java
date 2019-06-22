package backend.repository;
import backend.model.Job;
import backend.model.Job.*;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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
	}

	public Collection<Job> findAll() {
		return this.jobs.values();
	}

	
	public HashMap<String, Job> findJobsUser(String user_id) {
		HashMap <String, Job> userJobs = new HashMap<String, Job>();
		for (Map.Entry<String, Job> job : jobs.entrySet()) {
			if (job.getValue().getUser_id() == user_id) {
				userJobs.put(job.getKey(), job.getValue());
			}
		}
		return userJobs;
	}

	public void save(Job job) {
		this.jobs.put(job.getJob_id(), job);
	}


	public Job update(String job_id, Job job) {
		return this.jobs.replace(job_id, job);
	}

	public Job delete(String job_id) {
		return this.jobs.remove(job_id);
	}
}
