package main.domain;

import java.util.Set;

public class Topic {

    Long id;

    String name;

    String language;

    private Topic() {
    }

    public Topic(Long id, String name, String language) {
        this.id = id;
        this.name = name;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
