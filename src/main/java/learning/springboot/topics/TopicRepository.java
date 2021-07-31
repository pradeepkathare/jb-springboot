package learning.springboot.topics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topics, String> {

	public Topics findByTopicName(String name);
}
