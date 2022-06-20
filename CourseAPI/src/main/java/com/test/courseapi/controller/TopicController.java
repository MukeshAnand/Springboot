package com.test.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.courseapi.business.TopicService;
import com.test.courseapi.bean.*;


@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService businessService;
	
	@RequestMapping()
	public List<Topic> getallTopics(){
		
		return businessService.getAllTopics();
	}
	
	@RequestMapping("/{id}")
	public Topic getTopic(@PathVariable String id){
		
		return businessService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="")
	public void getTopic(@RequestBody Topic topic){
		
		 businessService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		
		 businessService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteTopic(@PathVariable String id){
		
		 businessService.deleteTopic(id);
	}
	

}
