package main.controller;

import main.Service.TopicService;
import main.Service.TranslationService;
import main.domain.Topic;
import main.domain.Translation;
import main.repository.TopicRepository;
import main.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    TopicService topicService;

    @Autowired
    TranslationService translationService;

    @GetMapping("/Topic")
    public List<Topic> getTopics(){
        return topicService.findAll();
    }

    @GetMapping("/Translation")
    public List<Translation> getTranslations(@RequestParam String topic_name){
        return translationService.findAll(topic_name);
    }


}
