package learning.springboot.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
 * Simple jpa working as expected
 * By default, Spring Boot configures the application to connect to an in-memory store 
 * with the username sa and an empty password.
 * To enable,it h2 console
 * spring.h2.console.enabled=true
http://localhost:8080/h2-console
 */
@RestController
public class TopicController {

	@Autowired
	TopicService topicservice;
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(path="/save",method=RequestMethod.POST)
	public void saveTopic(@RequestBody Topics topic) {
		topicservice.save(topic);
	}
	
	@RequestMapping
	public List<Topics> getTopics() {
		return topicservice.getTopics();
	}
	
	@RequestMapping(path="/topics/{topicId}")
	public Topics getTopicById(@PathVariable String topicId) {
		return topicservice.getTopicsById(topicId);
	}
	
	@RequestMapping(path="/topic/{name}")
	public Topics getTopicByName(@PathVariable String name) {
		System.out.println("naming-----");
		return topicservice.getTopicByName(name);
	}
	
	@RequestMapping(path="/topic/update",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topics topic) {
		 topicservice.save(topic);
	}
	
	
	@RequestMapping(path="/topic/delete/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicservice.delete(id);
	}
	
}
