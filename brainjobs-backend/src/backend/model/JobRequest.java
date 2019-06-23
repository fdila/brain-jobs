package backend.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import backend.model.Job.Datatype;
import backend.model.Job.Framework;
import backend.model.Job.Language;

@XmlRootElement
public class JobRequest {
    
    @XmlElement String user_id;
    @XmlElement String title;
    @XmlElement Language language;
    @XmlElement Framework framework;
    @XmlElement String dataset;
    @XmlElement Datatype dataset_datatype;
	public String getUser_id() {
		return user_id;
	}
	public String getTitle() {
		return title;
	}
	public Language getLanguage() {
		return language;
	}
	public Framework getFramework() {
		return framework;
	}
	public String getDataset() {
		return dataset;
	}
	public Datatype getDataset_datatype() {
		return dataset_datatype;
	}
    
    
    
}