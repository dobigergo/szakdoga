package main.domain;

import java.util.Set;

public class Word {

    private Long id;

    private String wordText;

    private Set<Translation> translationSet;

    private Word() {}

    public Word(Long id, String wordText) {
        this.id = id;
        this.wordText = wordText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWordText() {
        return wordText;
    }

    public void setWordText(String wordText) {
        this.wordText = wordText;
    }

    public Set<Translation> getTranslationSet() {
        return translationSet;
    }

    public void setTranslationSet(Set<Translation> translationSet) {
        this.translationSet = translationSet;
    }
}
