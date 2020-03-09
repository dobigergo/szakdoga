package main.domain;

import java.util.Set;

public class Translation {


    String word1;

    long language1;

    String word2;

    long language2;

    public Translation(String word1, long language1, String word2, long language2) {
        this.word1 = word1;
        this.language1 = language1;
        this.word2 = word2;
        this.language2 = language2;
    }

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public long getLanguage1() {
        return language1;
    }

    public void setLanguage1(long language1) {
        this.language1 = language1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }

    public long getLanguage2() {
        return language2;
    }

    public void setLanguage2(long language2) {
        this.language2 = language2;
    }
}
