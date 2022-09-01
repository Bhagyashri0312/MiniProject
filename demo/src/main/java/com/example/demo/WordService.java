package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class WordService {

    MixedWordRepository repository;
    String secretWord;
    StringBuilder showWord;
    int guessCount;


    public WordService() {
        repository = new MixedWordRepository();
        secretWord = repository.getWord();
        showWord = new StringBuilder("*".repeat(secretWord.length()));
        guessCount = 0;
    }

    public StringBuilder makeGuess(char ch) {
        boolean hit = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == ch) {
                showWord.setCharAt(i, ch);
                hit = true;
            }

        }
        if (!hit) {
            guessCount++;
        }
        return showWord;
    }


    public boolean finished() {

        return showWord.toString().equals(secretWord);
    }

    public boolean failed(){
        return guessCount>3;
    }

}
