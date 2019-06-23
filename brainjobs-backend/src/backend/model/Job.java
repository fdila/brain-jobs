package backend.model;

import java.util.Date;
import java.util.UUID;

public class Job {
	private String user_id;
	private String title;
	private Language language;
	private Framework framework;
	private String dataset;
	private Datatype dataset_datatype;
	private String job_id;
	private Date created_at;
	private Status status;
	
	public enum Language {
		Python,
		Java,
		Scala,
		R,
		Cpp,
		Julia
	}
	
	public enum Framework {
		Pytorch, 
		Tensorflow, 
		Caffe, 
		Keras,
		Deeplearning4j, 
		Apache_mahout, 
		Apache_singa
	}
	
	public enum Datatype {
		csv, 
		avro, 
		json
	}
	
	public enum Status {
		created, 
		enqueued, 
		building, 
		running, 
		terminated,
		failed, 
		unknown
	}
	
	
	//Default
	public Job() {
		super();
		Date date = new Date();
		UUID uuid = UUID.randomUUID();
		String job_id = uuid.toString();
		this.job_id = job_id;
		this.created_at = date;
		this.status = Status.created;	
	}
	
	//Costruttore con framework
	public Job(String user_id, String title, Language language, Framework framework, String dataset,
			Datatype dataset_datatype) {
		
		super();
		Date date = new Date();
		UUID uuid = UUID.randomUUID();
		String job_id = uuid.toString();
		this.job_id = job_id;
		this.created_at = date;
		this.status = Status.created;
		
		this.user_id = user_id;
		this.title = title;
		this.language = language;
		this.framework = framework;
		this.dataset = dataset;
		this.dataset_datatype = dataset_datatype;
	}
	
	//Costruttore senza framework
	public Job(String user_id, String title, Language language, String dataset,
			Datatype dataset_datatype) {
	
		super();
		Date date = new Date();
		UUID uuid = UUID.randomUUID();
		String job_id = uuid.toString();
		this.job_id = job_id;
		this.created_at = date;
		this.status = Status.created;	
		this.user_id = user_id;
		this.title = title;
		this.language = language;
		this.dataset = dataset;
		this.dataset_datatype = dataset_datatype;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Framework getFramework() {
		return framework;
	}

	public void setFramework(Framework framework) {
		this.framework = framework;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public Datatype getDataset_datatype() {
		return dataset_datatype;
	}

	public void setDataset_datatype(Datatype dataset_datatype) {
		this.dataset_datatype = dataset_datatype;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result + ((dataset == null) ? 0 : dataset.hashCode());
		result = prime * result + ((dataset_datatype == null) ? 0 : dataset_datatype.hashCode());
		result = prime * result + ((framework == null) ? 0 : framework.hashCode());
		result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (created_at == null) {
			if (other.created_at != null)
				return false;
		} else if (!created_at.equals(other.created_at))
			return false;
		if (dataset == null) {
			if (other.dataset != null)
				return false;
		} else if (!dataset.equals(other.dataset))
			return false;
		if (dataset_datatype != other.dataset_datatype)
			return false;
		if (framework != other.framework)
			return false;
		if (job_id == null) {
			if (other.job_id != null)
				return false;
		} else if (!job_id.equals(other.job_id))
			return false;
		if (language != other.language)
			return false;
		if (status != other.status)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [user_id=" + user_id + ", title=" + title + ", language=" + language + ", framework=" + framework
				+ ", dataset=" + dataset + ", dataset_datatype=" + dataset_datatype + ", job_id=" + job_id
				+ ", created_at=" + created_at + ", status=" + status + "]";
	}
	
}


