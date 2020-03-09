package main.repository;

import main.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class TopicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Topic> getAllTopic(){
        String sql = "Select * from topic order by name";
        return jdbcTemplate.query(sql, (rs,i) -> new Topic(rs.getLong("topic_id"),
                rs.getString("name"),
                rs.getString("language_id")));
    }

}
