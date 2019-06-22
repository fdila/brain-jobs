package backend.repository;
import backend.model.Job;

import java.util.Collection;
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
	}

	public Collection<Job> findAll() {
		return this.jobs.values();
	}

	
	public Job find(String job_id) {
		return this.jobs.get(job_id);
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
