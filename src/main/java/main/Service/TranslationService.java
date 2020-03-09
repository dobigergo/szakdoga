package main.Service;

import main.domain.Topic;
import main.domain.Translation;
import main.repository.TopicRepository;
import main.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class TranslationService {

    @Autowired
    private TranslationRepository translationRepository;

    public List<Translation> findAll(String topic_name){
        return translationRepository.getAllTranslations(topic_name);
    }

}
