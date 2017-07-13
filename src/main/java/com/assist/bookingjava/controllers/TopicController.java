package com.assist.bookingjava.controllers;

import com.assist.bookingjava.models.Topic;
import com.assist.bookingjava.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopic() {
        return topicService.getAllTopic();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
