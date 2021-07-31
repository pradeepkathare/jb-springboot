package learning.springboot.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public void save(Topics topic) {
		topicRepository.save(topic);		
	}

	public List<Topics> getTopics() {
	
		ArrayList<Topics> topics = new ArrayList<>();
		 topicRepository.findAll().forEach(topics::add);;
		return topics;
	}

	public Topics getTopicsById(String id) {
		return topicRepository.findById(id).get();
		
	}
	
	//Imp : i will just create method findBy<propertyname> in repository,where spring will internally implment it
	public Topics getTopicByName(String name) {
		return topicRepository.findByTopicName(name);
	}

	public void delete(String id) {
		topicRepository.deleteById(id);
	}

}
