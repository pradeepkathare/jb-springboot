package learning.springboot.topics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Topics {

	@Id
	String id;
	String topicName;
	String topicDescription;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	@Override
	public String toString() {
		return "Topics [id=" + id + ", topicName=" + topicName + ", topicDescription=" + topicDescription + "]";
	}
	
	
}
