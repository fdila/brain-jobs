import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import backend.model.Job;
import backend.model.Job.Datatype;
import backend.model.Job.Framework;
import backend.model.Job.Language;
import backend.repository.JobRepository;

public class Test {
	public static void main(String[] args) {
	  
		//HashMap<String, Job> jobs = JobRepository.getInstance().findJobsUser("pippo");
		HashMap<String, Job> jobs = JobRepository.getInstance().findAll();
		for (HashMap.Entry<String, Job> job : jobs.entrySet()) {
			System.out.println(job.getKey());
			System.out.println(job.getValue());

		}
	}
}
