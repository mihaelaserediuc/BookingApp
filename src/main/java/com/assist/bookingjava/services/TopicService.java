package com.assist.bookingjava.services;

import com.assist.bookingjava.database.TopicDao;
import com.assist.bookingjava.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    public List<Topic> getAllTopic() {
        List<Topic> topics = new ArrayList<>();
        topicDao.findAll().forEach(topics :: add);

        return topics;
    }

    public Topic getTopic(String id) {
        return topicDao.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicDao.save(topic);
    }

    public void updateTopic(Topic topic) {
        topicDao.save(topic);
    }

    public void deleteTopic(String id) {
        topicDao.delete(id);
    }

}
