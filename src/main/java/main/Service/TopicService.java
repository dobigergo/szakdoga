package main.Service;

import main.domain.Topic;
import main.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> findAll(){
        return topicRepository.getAllTopic();
    }

}
