package com.test.courseapi.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.courseapi.bean.Topic;
import com.test.courseapi.repository.TopicRepo;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicRepo;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepo.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic, String id) {	
		topicRepo.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
	}

}
