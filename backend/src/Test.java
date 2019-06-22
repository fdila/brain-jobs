import java.util.HashMap;
import java.util.Map;

import backend.model.Job;
import backend.repository.JobRepository;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Job> jobs = JobRepository.getInstance().findJobsUser("pippo");
		for (Map.Entry<String, Job> job : jobs.entrySet()) {
			System.out.println(job.getValue());
		}
	}

}
