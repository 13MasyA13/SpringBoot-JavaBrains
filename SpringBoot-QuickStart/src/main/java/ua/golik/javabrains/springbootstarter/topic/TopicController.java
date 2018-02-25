package ua.golik.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "Java Core", "Java Core Description"),
				new Topic("JavaScript", "jQuery", "jQuery Description")
				);
	}
}
