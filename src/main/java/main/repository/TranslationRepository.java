package main.repository;

import main.domain.Topic;
import main.domain.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class TranslationRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Translation> getAllTranslations(String topic_name){
        String sql = "select w1.word_name word1, w1.language_id language1, w2.word_name word2, w2.language_id language2 " +
                "from word as w1 inner JOIN translation_entry as t on w1.word_id = t.word1_id inner JOIN word as w2 " +
                "on w2.word_id = t.word2_id where t.topic_id = (Select topic_id from topic where name = "+ "\'"+topic_name+"\'" +" )";
        return jdbcTemplate.query(sql, (rs,i) -> new Translation(rs.getString("word1"),
                rs.getLong("language1"),
                rs.getString("word2"),
                rs.getLong("language2")));
    }

}
